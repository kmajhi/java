public class MyClass {
    private int myValue;

    // Constructor
    public MyClass(int value) {
        // Initialize some fields directly in the constructor
        this.myValue = value;

        // Call a private method to perform additional initialization or logic
        initialize();
    }

    // Private method called from the constructor
    private void initialize() {
        // Perform additional initialization or logic
        System.out.println("Object initialized with value: " + myValue);
    }

    // Other methods of the class
    public void doSomething() {
        // Accessing initialized object state here is safe
        System.out.println("Doing something with value: " + myValue);
    }

    public static void main(String[] args) {
        // Creating an instance of MyClass
        MyClass myObject = new MyClass(42);

        // Calling a method after object initialization
        myObject.doSomething();
    }
}
