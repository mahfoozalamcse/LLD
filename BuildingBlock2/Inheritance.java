package BuildingBlock2;
// Inheritance
class Vehicle {
    void start() {
        System.out.println("Vehicle starting...");
    }
}

class Car extends Vehicle {
    void openTrunk() {
        System.out.println("Opening trunk...");
    }
}



