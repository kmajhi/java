class SuperClass{
    SuperClass(){
        System.out.println("This is a constractor of SuperClass");
    }
}
class ChildClass extends SuperClass{
    public void NewMethod(){
        System.out.println("This is a method of ChildClass extended from SuperClass");
    }
}
public class Main {
    public static void main(String[] args) {
        ChildClass sc = new ChildClass();
        sc.NewMethod();
    }
}
