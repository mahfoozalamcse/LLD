package BuildingBlockOfOOPS;

class Person {
    String name;
    int age;

    Person() {
        this("Unknown", 0);  // calls parameterized constructor
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ConstructorChaining {
   public static void main(String[] args) {
     Person p = new Person();
     
     System.out.println(" Default "+p.name);

     p.name = "Mahfooz";
     p.age = 23;

     System.out.println("Name "+ p.name );
   }
    
}
