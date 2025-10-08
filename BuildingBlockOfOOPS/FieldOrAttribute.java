package BuildingBlockOfOOPS;

// Field (Attributes)
// Fields are variables declared inside a class, representing state of the object.
// They can be:
//         1.  Instance fields (per object)
//         2.  Static fields (shared by all objects)



class Product {
    String name;        // Instance variable
    double price;
    static int count;   // Shared across all objects

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        count++; // Increment shared count
    }

    void display() {
        System.out.println(name + " costs " + price);
    }
}
public class FieldOrAttribute {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 80000);
        Product p2 = new Product("Phone", 60000);

        p1.display();
        p2.display();

        System.out.println("Total Products: " + Product.count);
    }  
}
