import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        String letter = "Dear <|name|>, Thanks a lot.";
        letter = letter.replace("<|name|>", name);
        System.out.println(letter);
    }
}
