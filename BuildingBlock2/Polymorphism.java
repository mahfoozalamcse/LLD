package BuildingBlock2;

class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing circle");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing square");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Shape s1 = new Circle(); // upcasting
        Shape s2 = new Square();
        s1.draw(); // "Drawing circle"
        s2.draw(); // "Drawing square"
    }
}

