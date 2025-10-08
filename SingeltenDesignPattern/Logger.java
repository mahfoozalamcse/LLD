package SingeltenDesignPattern;

// Singleton Logger Class
class Logger {
    // volatile ensures visibility across threads
    private static volatile Logger instance;
    
    // Private constructor prevents external instantiation
    private Logger() {
        System.out.println("Logger Initialized!");
    }

    // Public method to provide global access
    public static Logger getInstance() {
        if (instance == null) { // First check
            synchronized (Logger.class) { // Thread-safe
                if (instance == null) { // Second check
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    // Logger method
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}

