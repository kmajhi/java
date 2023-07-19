public class Main{
    public static void main(String[] args) {
        int [] marks = {85,90,100,88,82};
        int sum  = 0;

        for (int element: marks){
            sum = sum+element;
        }
        System.out.println("The average of the given marks is = "+ sum/marks.length+"%");



    }
}
