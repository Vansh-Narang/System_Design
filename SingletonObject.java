public class SingletonObject {

    private static SingletonObject instance;
    // = new SingletonObject();

    // creating the reference
    private SingletonObject() {
        // making private constructor so that cannot access by other classes
    }

    public static SingletonObject getInstance() {
        // function to return instance
        if (instance == null) {
            // only one time instance will be created
            instance = new SingletonObject();
        }
        return instance;
    }

    public void showMessage() {
        // showing or displaying the msg
        System.out.println("Hello Singleton Pattern");
    }
}