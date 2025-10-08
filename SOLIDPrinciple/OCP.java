package SOLIDPrinciple;
// Open/Closed Principle (OCP)

// problem without OCP
// class PaymentProcessor {
//     void pay(String type, double amount) {
//         if (type.equals("Paypal")) { /* logic */ }
//         else if (type.equals("Stripe")) { /* logic */ }
//     }
// }


// OCP Desighn 
interface Payment {
    void pay(double amount);
}

class PaypalPayment implements Payment {
    public void pay(double amount) { System.out.println("Paypal: $" + amount); }
}

class StripePayment implements Payment {
    public void pay(double amount) { System.out.println("Stripe: $" + amount); }
}

class PaymentProcessor {
    void processPayment(Payment payment, double amount) {
        payment.pay(amount); // open for extension, closed for modification
    }
}

public class OCP {
    public static void main(String[] args) {
        
    }
}
