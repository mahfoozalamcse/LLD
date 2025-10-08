package BuildingBlockOfOOPS;


// 1. variable

class Circle {
    final double PI = 3.14159; // constant

    double area(double radius) {
        // PI = 3.14  Error cannot change final variable
        return PI * radius * radius;
    }
}

// 2. method
class Vehicle {
    final void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {
    // void start() Cannot override final method
}

// final class
final class Constants {
    static final String APP_NAME = "LibrarySystem";
}

// class MyConstants extends Constants Not allowed


public class FinalMehodKeword {
  
}
