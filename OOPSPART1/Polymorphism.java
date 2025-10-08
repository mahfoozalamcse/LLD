package OOPSPART1;

/*
 Polymorphism — Many Forms
   Two Types:
      Compile-time (Method Overloading)
      Runtime (Method Overriding)
 */

 // Compile-time — Overloading
class CompilePolymorphism {
    int add(int a, int b) { 
        return a + b; 
    }
    double add(double a, double b) { 
        return a + b; 
    }
}

class AnimalRunTime {
    void speak() {
        System.out.println("Animal speaks...");
    }
}

class Dog extends AnimalRunTime {
    @Override
    void speak() {
        System.out.println("Dog barks...");
    }
}

public class Polymorphism {
    public static void main(String[] args) {

        // overloading

        CompilePolymorphism obj = new CompilePolymorphism();
        System.out.println();
        System.out.println(obj.add(2, 3));       // int version
        System.out.println(obj.add(2.5, 3.5));   // double version



        // run time Overriding
        AnimalRunTime a = new Dog(); // Upcasting
        a.speak(); // Calls Dog’s version
    }
}


