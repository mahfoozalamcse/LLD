package BuildingBlock2;

// real world implementation encapsulation
public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        setName(name);
        setAge(age);
    }

    // Controlled access
    public void setName(String name) {
        if (name == null || name.isBlank())
            throw new IllegalArgumentException("Invalid name");
        this.name = name;
    }

    public void setAge(int age) {
        if (age <= 0) throw new IllegalArgumentException("Age must be > 0");
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
}


