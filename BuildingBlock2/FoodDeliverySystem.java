package BuildingBlock2;
import java.util.*;

// ...............................
// 1. Data Hiding & Encapsulation
// 
final class MenuItem {
    private final String name;
    private final double price;

    public MenuItem(String name, double price) {
        if (price < 0) throw new IllegalArgumentException("Invalid price");
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}

// ..................................
// 2. Abstraction — Payment Interface
// 
interface PaymentGateway {
    boolean processPayment(double amount);
}

// 3. Polymorphism — different gateways
class PayPalPayment implements PaymentGateway {
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
        return true;
    }
}

class StripePayment implements PaymentGateway {
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing Stripe payment of $" + amount);
        return true;
    }
}

// ..................................
// 4. Abstract Class — Shared User Behavior
// 
abstract class User {
    protected String name;
    protected String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public abstract void displayRole();
}

// ....................................
// 5. Inheritance — Customer, DeliveryAgent
// 
class Customer extends User {
    private List<Order> orders = new ArrayList<>(); // aggregation

    public Customer(String name, String email) {
        super(name, email);
    }

    @Override
    public void displayRole() {
        System.out.println(name + " is a Customer");
    }

    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed a new order!");
    }

    public List<Order> getOrders() {
        return Collections.unmodifiableList(orders);
    }
}

class DeliveryAgent extends User {
    public DeliveryAgent(String name, String email) {
        super(name, email);
    }

    @Override
    public void displayRole() {
        System.out.println(name + " is a Delivery Agent");
    }

    public void deliverOrder(Order order) {
        System.out.println(name + " delivered order: " + order.getId());
    }
}

// ....................................
// 6. Composition — Restaurant has Menu
// 
class Restaurant {
    private String name;
    private final List<MenuItem> menu = new ArrayList<>();

    public Restaurant(String name) {
        this.name = name;
    }

    public void addItem(MenuItem item) {
        menu.add(item);
    }

    public List<MenuItem> getMenu() {
        return Collections.unmodifiableList(menu);
    }

    public String getName() { return name; }
}

// .....................................
// 7 . Dependency — Order depends on PaymentGateway
// 
class Order {
    private static int nextId = 1;
    private final int id;
    private final Customer customer;
    private final Restaurant restaurant;
    private final List<MenuItem> items;
    private final double total;

    public Order(Customer customer, Restaurant restaurant, List<MenuItem> items) {
        this.id = nextId++;
        this.customer = customer;
        this.restaurant = restaurant;
        this.items = new ArrayList<>(items);
        this.total = calculateTotal();
    }

    private double calculateTotal() {
        return items.stream().mapToDouble(MenuItem::getPrice).sum();
    }

    public int getId() { return id; }
    public double getTotal() { return total; }

    // Dependency Injection
    public boolean makePayment(PaymentGateway gateway) {
        return gateway.processPayment(total);
    }

    @Override
    public String toString() {
        return "Order #" + id + " for " + customer.name + " at " + restaurant.getName() +
               " | Total: $" + total + " | Items: " + items;
    }
}


public class FoodDeliverySystem {
    public static void main(String[] args) {
        // Create Restaurant (composition)
        Restaurant dominos = new Restaurant("Dominos");
        dominos.addItem(new MenuItem("Pizza", 12.5));
        dominos.addItem(new MenuItem("Garlic Bread", 5.0));
        dominos.addItem(new MenuItem("Coke", 2.0));

        // Create Customer & Delivery Agent (inheritance)
        Customer alice = new Customer("Alam", "alice@gmail.com");
        DeliveryAgent bob = new DeliveryAgent("Mahfooz", "bob@delivery.com");

        alice.displayRole();
        bob.displayRole();

        // Customer places an order (aggregation)
        List<MenuItem> selectedItems = List.of(dominos.getMenu().get(0), dominos.getMenu().get(2));
        Order order1 = new Order(alice, dominos, selectedItems);

        // Encapsulation in action
        alice.placeOrder(order1);
        System.out.println(order1);

        // Polymorphism — choose payment dynamically
        PaymentGateway payment = new StripePayment(); // can switch to PayPalPayment easily
        boolean success = order1.makePayment(payment);

        if (success) {
            bob.deliverOrder(order1);
            System.out.println("Order delivered successfully!");
        }
    }
}


