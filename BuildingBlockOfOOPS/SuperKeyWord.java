package BuildingBlockOfOOPS;


class Person {
    String name;

    Person(String name) {
        this.name = name;
        System.out.println("Parent Constructor called for: " + name);
    }
}

class Employee extends Person {
    int id;

    Employee(String name, int id) {
        super(name); // call parent constructor first
        this.id = id;
        System.out.println("Child Constructor called with ID: " + id);
    }
}

public class SuperKeyWord {
    public static void main(String[] args) {
        Employee emp = new Employee("Mahfooz .. ", 101);
        System.out.println("Id : " + emp.id);
    }
}


