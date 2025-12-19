package DesignPattern;

import java.util.*;


// 1. Singleton Pattern — Database Connection

class DatabaseConnection {
    private static DatabaseConnection instance;
    private DatabaseConnection() {
        System.out.println("DB Connection Created");
    }
    public static DatabaseConnection getInstance() {
        if (instance == null) instance = new DatabaseConnection();
        return instance;
    }
}


// 2.  Strategy Pattern — Payment

interface PaymentStrategy {
    boolean pay(double amount);
}

class PaypalStrategy implements PaymentStrategy {
    public boolean pay(double amount) {
        System.out.println("Paying $" + amount + " using PayPal");
        return true;
    }
}

class StripeStrategy implements PaymentStrategy {
    public boolean pay(double amount) {
        System.out.println("Paying $" + amount + " using Stripe");
        return true;
    }
}



// 3. Factory Pattern — Payment Factory

class PaymentFactory {
    public static PaymentStrategy getPayment(String type) {
        if (type.equalsIgnoreCase("paypal")) return new PaypalStrategy();
        else if (type.equalsIgnoreCase("stripe")) return new StripeStrategy();
        throw new IllegalArgumentException("Unknown payment type");
    }
}


// 4. Observer Pattern — Notify Delivery Agent

interface Observer {
    void update(Order order);
}

interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}

class DeliveryAgent implements Observer {
    private String name;
    public DeliveryAgent(String name) { this.name = name; }
    public void update(Order order) {
        System.out.println(name + " notified: Order #" + order.getId() + " is ready for delivery");
    }
}


// 5. Builder Pattern — Build Complex Orders

final class MenuItem {
    private final String name;
    private final double price;

    public MenuItem(String name, double price) { this.name = name; this.price = price; }
    public String getName() { return name; }
    public double getPrice() { return price; }
}

class Order implements Subject {
    private static int counter = 1;
    private final int id;
    private final List<MenuItem> items;
    private final double total;
    private final List<Observer> observers = new ArrayList<>();

    private Order(List<MenuItem> items) {
        this.id = counter++;
        this.items = items;
        this.total = items.stream().mapToDouble(MenuItem::getPrice).sum();
    }

    public int getId() { return id; }
    public double getTotal() { return total; }

    // Observer methods
    public void addObserver(Observer o) { observers.add(o); }
    public void removeObserver(Observer o) { observers.remove(o); }
    public void notifyObservers() { observers.forEach(o -> o.update(this)); }

    // Builder for complex orders
    public static class Builder {
        private List<MenuItem> items = new ArrayList<>();
        public Builder addItem(MenuItem item) { items.add(item); return this; }
        public Order build() { return new Order(items); }
    }
}


// User Hierarchy — Inheritance & SRP

abstract class User {
    protected String name;
    public User(String name) { this.name = name; }
}

class Customer extends User {
    public Customer(String name) { super(name); }
    public void placeOrder(Order order, PaymentStrategy payment) {
        System.out.println(name + " placed Order #" + order.getId());
        boolean success = payment.pay(order.getTotal());
        if (success) order.notifyObservers();
    }
}



public class FoodDeliveryPatternDemo {
    public static void main(String[] args) {
        // Singleton DB Connection
        DatabaseConnection db = DatabaseConnection.getInstance();

        // Build Menu Items
        MenuItem pizza = new MenuItem("Pizza", 12.5);
        MenuItem coke = new MenuItem("Coke", 2.0);
        MenuItem garlic = new MenuItem("Garlic Bread", 5.0);

        // Observer (Delivery Agents)
        DeliveryAgent bob = new DeliveryAgent("Alam");
        DeliveryAgent aliceAgent = new DeliveryAgent("Mahfooz");

        // Build Order using Builder Pattern
        Order order = new Order.Builder()
                .addItem(pizza)
                .addItem(coke)
                .build();

        // Register Observers
        order.addObserver(bob);
        order.addObserver(aliceAgent);

        // Customer places order using Strategy + Factory
        Customer customer = new Customer("Raj");
        PaymentStrategy payment = PaymentFactory.getPayment("paypal");
        customer.placeOrder(order, payment);
    }
}

