import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            int x = 10;
            int y =0;
            int result = x/y;


        } catch (ExceptionInInitializerError result) {
            System.out.println("Result: " + result);
        } catch (ArithmeticException newResult){
            System.out.println("Result: "+newResult);
        } finally{
            System.out.println("Last line of the program");
        }
    }
}
