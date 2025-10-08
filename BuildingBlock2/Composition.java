package BuildingBlock2;

class Engine {
    public void start() {
        System.out.println("Engine started...");
    }
}

class Car {
    private Engine engine; // composition

    public Car() {
        engine = new Engine(); // created and owned by Car
    }

    public void startCar() {
        engine.start();
        System.out.println("Car running...");
    }
}

public class Composition {
    public static void main(String[] args) {
       
       

    }
}
