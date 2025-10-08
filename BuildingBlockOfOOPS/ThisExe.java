package BuildingBlockOfOOPS;

// Resolve naming conflict

class Employee {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name; // this refers to current object
        this.id = id;
    }

    void display() {
        System.out.println("Employee: " + name + " (" + id + ")");
    }
}

public class ThisExe {
    public static void main(String[] args) {
        Employee e = new Employee("Mahfooz", 100);
        e.display();
    }

}
