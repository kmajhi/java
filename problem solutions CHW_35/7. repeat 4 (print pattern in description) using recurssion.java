public class Main {
    static void pattern(int n){
        if(n>0){
            for (int i = 0; i < n; i++) {
                System.out.print("* ");
            }
            System.out.println();
            pattern(n - 1);
        }
    }
        public static void main (String[]args){
        pattern(4);
        }
    }
