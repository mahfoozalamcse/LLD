package BuildingBlockOfOOPS;

// Constructor overloading
// compile time polymorphism


// Constructor Overloading means having multiple constructors in a class with different parameter lists.
// This provides flexibility in object creation.
// It is a form of Compile-Time Polymorphis

class Student {
    String name;
    int age;
    String department;

    // Default constructor
    Student() {
        this("Unknown", 0, "N/A");
    }

    // Constructor with name only
    Student(String name) {
        this(name, 18, "General");
    }

    // Constructor with name and age
    Student(String name, int age) {
        this(name, age, "Computer Science");
    }

    // Full constructor
    Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    void display() {
        System.out.println(name + " | " + age + " | " + department);
    }
}

public class ConstructorOverLoad {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Mahfooz");
        Student s3 = new Student("Alam", 22);
        Student s4 = new Student("Anchal", 21, "AI & ML");

        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}
 

