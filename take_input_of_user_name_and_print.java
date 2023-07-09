import java.util.Scanner;

public class take_input_of_user_name_and_print{
  public static void main(String[]args){
    System.out.print("Enter your full name: ");
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    System.out.print("Your entered full name is: " + name);
  }
}
