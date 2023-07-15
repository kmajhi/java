public class Main {
    public static void main(String[] args) {
        int i;

        for (i = 1; i <= 10; i++) {

            if (i == 2) {
                System.out.println("Loop will not execute number 2, if we use \"continue\".");
                continue;
            }
            if (i==5){
                System.out.println(i);
                break;
            }
            System.out.println(i);
        }
        System.out.println("Loop ends here.");

}
}
