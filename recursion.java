import java.util.Scanner;

public class Main {

    private static void sayHi(long count) {
        System.out.println("Hi!");
        if(count<=1){
            return;
        }
        sayHi(count -1);
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = sc.nextLong();
        sayHi(num);
    }
}
