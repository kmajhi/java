public class Main{
    public static void main(String[] args) {
        float [] arr = {1.5f,2.5f,3.5f,4.5f,5.5f};
        float sum =0;

        for(float element : arr){
            sum = sum + element;
        }
        System.out.println(sum);
    }
}
