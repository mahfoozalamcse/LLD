package SingeltenDesignPattern;

public class SingletonLoggerDemo {
      public static void main(String[] args) {
        // Simulate different parts of the application
        Logger appLogger1 = Logger.getInstance();
        Logger appLogger2 = Logger.getInstance();

        appLogger1.log("Application started!");
        appLogger2.log("Performing some operations...");
        appLogger1.log("Application ended!");

        // Check if both instances are same
        if (appLogger1 == appLogger2) {
            System.out.println("Both Logger instances are the same ");
        }
    }
}
