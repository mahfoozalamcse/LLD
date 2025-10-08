package BuildingBlock2;

public class Abstract {


public abstract class Animal {

    protected String name;
    public Animal(String name) {
         this.name = name; 
    }

    public void eat() { 
      System.out.println(name + " eats"); 
    } // concrete
    public abstract void speak(); // abstract
}

public class Dog extends Animal {
    public Dog(String name) { super(name); }
    @Override
    public void speak() { 
        System.out.println("Bark"); 
    }
}
  
public static void main(String[] args) {
    
  }

}
