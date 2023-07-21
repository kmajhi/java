public class Main{
    static void multiplication(int n){
       for(int i=1; i<=10; i++){
          int multi = n*i;
           System.out.format("%d x %d = %d\n", n, i, multi);
       }
    }
    public static void main(String[] args) {
        multiplication(2);
    }
}
