public class Main {
    static float avg(float ...arr){
        float average=0, sum =0;
        for (int i = 0; i<arr.length; i++){
            sum = sum + arr[i];
             average = sum/arr.length;
        }
        return average;
    }
        public static void main (String[]args){
        float c = avg(33.5f,33.3f,33.3f);
            System.out.format("%.2f", c);

        }
    }
