package SOLIDPrinciple;
// Liskov Substitution Principle (LSP)
// problem with LSP

// class Bird {
//     void fly() {}
// }

// class Ostrich extends Bird {
//     void fly() { throw new UnsupportedOperationException(); }
// }


// LSP Design
interface Flyable {
    void fly();
}

class Sparrow implements Flyable {
    public void fly() {}
}

class Ostrich { } // doesn't implement Flyable



public class LSP {
    public static void main(String[] args) {
        
    }
}
