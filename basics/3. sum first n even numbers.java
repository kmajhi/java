import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum= 0;
        System.out.print("Enter the number =>>\t");
        int n = sc.nextInt();

        for (int i=0; i<=n; i++){
            if (i%2==0){
                sum = sum +i;
            }
        }
        System.out.println("Sum of the first even numbers of n =>> "+ sum);
    }
}
