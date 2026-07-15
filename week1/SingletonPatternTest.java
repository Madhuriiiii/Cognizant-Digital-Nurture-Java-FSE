class Logger {

    // Create only one object
    private static Logger instance;

    // Private constructor
    private Logger() {
        System.out.println("Logger instance created.");
    }

    // Method to return the same object
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        } else {
            System.out.println("Logger instance reused.");
        }
        return instance;
    }
}

public class SingletonPatternTest {

    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();

        Logger logger2 = Logger.getInstance();

        if (logger1 == logger2) {
            System.out.println("Only one Logger instance exists.");
        } else {
            System.out.println("Different Logger instances created.");
        }
    }
}