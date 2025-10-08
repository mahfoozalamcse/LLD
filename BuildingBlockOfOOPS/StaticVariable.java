package BuildingBlockOfOOPS;


class Employee {
    static int companyCode = 1001;  // shared
    String name;

    public Employee(String name) {
        this.name = name;
    }

    void show() {
        System.out.println(name + " | CompanyCode: " + companyCode);
    }
}

public class StaticVariable {
    public static void main(String[] args) {
        Employee e1 = new Employee("Mahfooz");
        Employee e2 = new Employee("Alam");

        e1.show();
        e2.show();

        // Change static variable
        Employee.companyCode = 2002;

        e1.show(); // Both reflect the change
        e2.show();
    }
}
   

