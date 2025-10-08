package BuildingBlock2;

// Abstraction 


// Abstraction
interface PaymentGateway {
    boolean processPayment(double amount);
}

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

public class AbstractionDemo {
    public static void main(String[] args) {
        PaymentGateway paypal = new PayPalPayment();
        PaymentGateway stripe = new StripePayment();

        paypal.processPayment(100.00);
        stripe.processPayment(250.00);
    }
}

