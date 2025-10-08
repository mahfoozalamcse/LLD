package BuildingBlockOfOOPS;

// Class & Object → Constructor → this Keyword → Access Modifiers → Fields → Methods → Method Overloading



class Car {
    // Fields (Properties)
    String brand;
    int year;

    // Method (Behavior)
    void start() {
        System.out.println(brand + " is starting...");
    }
}

public class ClassObject {
    public static void main(String[] args) {
        Car car1 = new Car();   // Object creation
        car1.brand = "Tesla";
        car1.year = 2025;
        car1.start();
    }
}


