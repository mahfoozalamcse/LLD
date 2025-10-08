package BuildingBlockOfOOPS;


class MathUtils {
    static int counter;

    // Static block runs once when class loads
    static {
        System.out.println("Static block initialized..... ");
        counter = 10;
    }

    static int square(int n) {
        return n * n;
    }
}

public class StaticMethodAndBlock {
    public static void main(String[] args) {
        System.out.println(MathUtils.square(5));
        System.out.println("Counter: " + MathUtils.counter);
    }
}


