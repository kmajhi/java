import java.util.*;

public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("\n");
      
        for (int i=1; i<=10; i++) {
            int multiply = num*i;
            System.out.println(num +" x "+ i + " \t= \t"+ multiply);
        }
    }
}
