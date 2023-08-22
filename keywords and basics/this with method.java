class MyClass {
    int value;

    MyClass(int value) {
        this.value = value; 
    }

    void displayValue() {
        System.out.println("Value: " + this.value);
    }

    MyClass modifyValue(int newValue) {
        this.value = newValue;
        return this;
    }

    void callAnotherMethod() {
        this.displayValue();
    }

    void overloadedMethod() {
        System.out.println("Overloaded method without parameters");
    }

    void overloadedMethod(int x) {
        this.overloadedMethod();
        System.out.println("Overloaded method with int parameter");
    }

    class InnerClass {
        void accessOuter() {
            System.out.println("Outer value from inner class: " + MyClass.this.value);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass(10);
        obj.displayValue();
        obj.modifyValue(20).displayValue();
        obj.callAnotherMethod();
        obj.overloadedMethod(5);

        MyClass.InnerClass innerObj = obj.new InnerClass();
        innerObj.accessOuter();
    }
}
