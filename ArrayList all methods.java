import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);

        System.out.println("Total array: " + number);
        System.out.println("Size of Array = " + number.size());
        System.out.println("Array index number 3 is: " + number.get(3));
        number.set(2,49);//for replacing a number in a specic index number. (index number, new number for replacing);
        System.out.println("By Replacing 49 to index number 2 we get = " + number);
        number.remove(3);
        System.out.println("Removing a number from index number 3 we get: "+ number);
        number.add(2,45);
        System.out.println("After adding 45 in index 2 we get: "+ number);

        int b = number.indexOf(45);
        System.out.println("Checking an index number of a number in an array = " + b);
        boolean checkNumber = number.contains(49);
        System.out.println("49 in the array: "+ checkNumber);
        checkNumber = number.contains(69);
        System.out.println("69 is in the array: " + checkNumber);
//        number.removeAll(number); //to remove all number in an array.
        number.clear();// to clear all numbers in an array.
        System.out.println("After removing all elements in an arrray we get = " + number);


    }
}
