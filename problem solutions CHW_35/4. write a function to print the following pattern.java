public class Main{
    static void pattern1(int n){
        for (int i = n; i > 0; i--){
            for (int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern1(4);
    }
}
