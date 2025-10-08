package BuildingBlockOfOOPS;


class Animal {
    void speak() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void speak() {
        System.out.println("Dog barks");
    }

    void showParentSpeak() {
        super.speak(); // call parent version
    }
}

public class AccessParentMethod {
    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println();
        d.speak();          // calls child method
        d.showParentSpeak(); // calls parent method
    }
}
 

