package OOPSPART1;


class Car {
    String model;
    int year;

    void start() {
        System.out.println(model + " is starting...");
    }

    void stop() {
        System.out.println(model + " is stopping...");
    }
}

public class ObjecClass {
    public static void main(String[] args) {
        Car tesla = new Car(); // Object creation
        tesla.model = "Tesla Model S";
        tesla.year = 2025;

        tesla.start();
        tesla.stop();
    }
}


