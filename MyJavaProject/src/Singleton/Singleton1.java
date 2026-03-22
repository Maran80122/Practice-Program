package Singleton;

public class Singleton1 {

    // Eager initialization
    private static final Singleton1 instance = new Singleton1();

    // Private constructor to prevent instantiation
    private Singleton1() {
        System.out.println("Singleton instance created.");
    }

    // Public method to provide access to the instance
    public static Singleton1 getInstance() {
        return instance;
    }

    // Example method
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }

    // Main method for testing
    public static void main(String[] args) {
        Singleton1 s1 = Singleton1.getInstance();
        Singleton1 s2 = Singleton1.getInstance();

        s1.showMessage();

        // Check if both references point to the same object
        if (s1 == s2) {
            System.out.println("Both are the same instance.");
        } else {
            System.out.println("Different instances.");
        }
    }
}
