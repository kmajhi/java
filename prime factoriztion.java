import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");

        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println("Prime factors are not defined for numbers less than 2.");
            return;
        }

        System.out.print("Prime factors of " + number + " are: ");

        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                System.out.print(i + " ");
                number = number / i;
            }
        }

        scanner.close();
    }
}
