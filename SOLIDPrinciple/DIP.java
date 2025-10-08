package SOLIDPrinciple;

// Dependency Inversion Principle (DIP)

// problem with DIP

// class PaypalService {
//     void pay() {}
// }

// class Checkout {
//     PaypalService paypal = new PaypalService(); // depends on concrete class
//     void makePayment() { paypal.pay(); }
// }


// Correct DIP Design

interface PaymentService {
    void pay();
}

class PaypalService implements PaymentService {
    public void pay() {
        
    }
}

class StripeService implements PaymentService {
    public void pay() {

    }
}

class Checkout {
    private PaymentService paymentService; // depends on abstraction
    public Checkout(PaymentService paymentService) { 
        this.paymentService = paymentService; 
    }
    void makePayment() { 
        paymentService.pay(); 
    }
}


public class DIP {
    public static void main(String[] args) {
        
    }
}
