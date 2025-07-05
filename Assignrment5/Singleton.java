class MainSingleton {
    private static MainSingleton instance;

    private MainSingleton() {
        System.out.println("Singleton instance created");
    }

    public static MainSingleton getInstance() {
        if (instance == null) {
            instance = new MainSingleton();
        } else {
            System.out.println("Singleton instance already exists");
        }
        return instance;
    }

    public void displayMessage() {
        System.out.println("Hello from Singleton!");
    }
}

public class Singleton {
    public static void main(String[] args) {
        MainSingleton obj1 = MainSingleton.getInstance();
        obj1.displayMessage();

        MainSingleton obj2 = MainSingleton.getInstance();
        obj2.displayMessage();

        if (obj1 == obj2) {
            System.out.println("Both objects are the same instance.");
        } else {
            System.out.println("Objects are different instances.");
        }
    }
}
