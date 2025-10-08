package BuildingBlockOfOOPS;

// Methods (Behavior)
//    Concept
//           Methods define behavior or functionality of a class.
//           They can access fields, perform actions, and return values.

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    void showResult(int result) {
        System.out.println("Result: " + result);
    }
}

public class MethodBehaviour {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int sum = calc.add(10, 20);
        calc.showResult(sum);
    }
}


