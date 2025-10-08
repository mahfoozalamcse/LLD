package DesignPattern;


// 1. Singleton – Only one instance exists

// class DatabaseConnection {
//     private static DatabaseConnection instance;
//     private DatabaseConnection() {}
//     public static DatabaseConnection getInstance() {
//         if (instance == null) instance = new DatabaseConnection();
//         return instance;
//     }
// }


// 2. Factory method encapsulate object 

// interface Payment {
//     void pay();
// }

// class PaypalPayment implements Payment { 
//     public void pay() { 
//         System.out.println("PayPal");
//      } 
// }
// class StripePayment implements Payment { 
//     public void pay() {
//          System.out.println("Stripe"); 
//         } 
// }

// class PaymentFactory {
//     public static Payment getPayment(String type) {
//         if(type.equals("Paypal")) return new PaypalPayment();
//         else return new StripePayment();
//     }
// }

// // Usage
// Payment payment = PaymentFactory.getPayment("Paypal");
// payment.pay();



// public class CreationalPattern {
//     public static void main(String[] args) {
        
//     }
// }
