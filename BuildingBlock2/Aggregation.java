package BuildingBlock2;
import java.util.*;


// Aggregation = weak ownership.
// Objects have independent lifecycle.



class Employee {
    private String name;
    public Employee(String name) { this.name = name; }
}



class Department {
    private List<Employee> employees; // aggregation

    public Department(List<Employee> employees) {
        this.employees = employees;
    }
}
