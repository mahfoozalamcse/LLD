package OOPSPART1;

/*
 Composition vs Inheritance (Advanced FAANG Concept)
       Composition = HAS-A relationship
       Inheritance = IS-A relationship
       
 */
class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

class Car {
    private Engine engine; // Composition
 

    public Car() {
        engine = new Engine();
    }

    void startCar() {
        engine.start();
        System.out.println("Car is running...");
    }
}

public class CompositionInheritance {
    public static void main(String[] args) {
        Car c = new Car();
        c.startCar();
    }
}
 

