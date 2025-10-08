package BuildingBlockOfOOPS;


class Student {
    String name;
    int age;

    // Default constructor
    public Student() {
        System.out.println("Default Constructor called");
    }

    // Parameterized constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name + " - " + age);
    }
}

public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student(); // Calls default
        Student s2 = new Student("Mahfooz", 22); // Calls parameterized
        s2.display();
        s1.display();
    }
}


