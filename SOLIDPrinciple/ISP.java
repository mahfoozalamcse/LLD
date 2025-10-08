package SOLIDPrinciple;


// Interface Segregation Principle (ISP)


// problem with ISP
// interface Worker {
//     void work();
//     void eat();
//     void sleep();
// }

// class Robot implements Worker {
//     public void work() {}
//     public void eat() { /* irrelevant */ }
//     public void sleep() { /* irrelevant */ }
// }



// Correct ISP Design

interface Workable { void work(); }
interface Eatable { void eat(); }
interface Sleepable { void sleep(); }

class Human implements Workable, Eatable, Sleepable {
    public void work() {}
    public void eat() {}
    public void sleep() {}
}

class Robot implements Workable {
    public void work() {}
}


public class ISP {
    public static void main(String[] args) {
        
    }
}
