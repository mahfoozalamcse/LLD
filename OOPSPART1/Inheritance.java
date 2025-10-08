package OOPSPART1;
/*
 * Inheritance — Reusability
   Concept
        Inheritance allows a child class to reuse the code of a parent class.
 */

class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    void honk() {
        System.out.println("Car is honking...");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();  // Inherited
        c.honk();   // Own method
    }
}


