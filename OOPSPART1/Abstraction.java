package OOPSPART1;
/*
  Abstraction — Hiding Implementation Details
  Only show essential features, hide complex logic.
  Achieved using:
      Abstract classes
      Interfaces
 */

abstract class Payment {
    abstract void makePayment(); // Abstract method

    void validatePayment() {
        System.out.println("Validating payment details...");
    }
}


class CreditCardPayment extends Payment {
    @Override
    void makePayment() {
        System.out.println("Processing credit card payment...");
    }
}

class UpiPayment extends Payment {
    @Override
    void makePayment() {
        System.out.println("Processing UPI payment...");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Payment payment = new UpiPayment();
        payment.validatePayment();
        payment.makePayment();
    }
}
 

