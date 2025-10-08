package BuildingBlockOfOOPS;


class MethodOverload {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverload math = new MethodOverload();

        System.out.println(math.add(5, 10));          // calls int version
        System.out.println(math.add(2.5, 3.5));       // calls double version
        System.out.println(math.add(1, 2, 3));        // calls 3-parametre version
    }
}


