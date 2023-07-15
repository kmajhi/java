import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:>>\t ");
        int count = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= count; i++) {

            sum += (2*i);
        }

        System.out.println("The sum of the first " + count + " even numbers is: " + sum);
    }
}
