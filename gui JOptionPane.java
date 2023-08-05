import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(50);
        number.add(60);
        number.add(30);
        number.add(40);
        number.add(10);
        System.out.println("Array = " + number);
        System.out.println("Array length: " + number.size());
        number.sort(Comparator.naturalOrder());
        System.out.println("Sorting numbers in natural order" + number);
        number.sort(Comparator.reverseOrder());
        System.out.println("Sorting in reverse order: " + number);

        ImageIcon img = new ImageIcon("sigma.jpg");

        JOptionPane jp = new JOptionPane();
        String f_name = JOptionPane.showInputDialog(null, "Enter your first name: ", "Jeff Assocation Sign in Page. ", JOptionPane.INFORMATION_MESSAGE);
        String l_name = JOptionPane.showInputDialog(null, "Enter your last name: ", "Jeff Assocation Sign in Page. ", JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Hello, " + f_name + " "+ l_name+ " Welcome to Jeff Association", "Jeff Assocation", JOptionPane.INFORMATION_MESSAGE,img);
        JOptionPane.showConfirmDialog(null,"Do you want to quit? ", "Jeff Assocation",JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_CANCEL_OPTION);
    }
}
