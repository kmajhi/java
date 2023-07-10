import java.util.Scanner;

public class sum_of_two_numbers_from_user_input{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float num1 = sc.nextFloat();
        System.out.print("Enter the second number: ");
        float num2 = sc.nextFloat();
        float sum = num1 + num2;
        System.out.println("Sum of "+ num1 +" + " + num2 + " = " + sum);

    }
}