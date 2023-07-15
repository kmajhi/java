import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i;
        System.out.print("Enter the number =>>\t");
        int n = sc.nextInt();

        for ( i=1; i<=10; i++){
            System.out.printf("%d x %d \t= \t%d\n", n,i,n*i);
        }
    }
}
