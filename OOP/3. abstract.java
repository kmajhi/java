abstract class Base{
    public Base(){
        System.out.println("I am a constructor of Base");
    }
    public void sayHello(){
        System.out.println("Hello!");
    }
    abstract public void greet();
    abstract public void greet2();
}

class Base2 extends Base{
    public void greet(){
        System.out.println("Good Morning!");
    }
    public void greet2(){
        System.out.println("Good afternoon");
    }
}
 abstract class Base3 extends Base2{
    public void th(){
        System.out.println("I am good");
    }
}
public class Main {
    public static void main(String[] args) {
//        Base b = new Base(); --> error
        Base2 b2 = new Base2();
//        Base3 b3 = new Base3(); --> error
        b2.sayHello();
        b2.greet();
        b2.greet2();
    }
}
