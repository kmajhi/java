public class Main {
    public static void main(String[] args) {
        int [] arr =  {1,2,3,4,5,6};
       int n = Math.floorDiv(arr.length, 2);
        int l =  arr.length;
        int tmp;

        for (int i=0; i<n; i++){
            tmp = arr[i];
            arr [i] = arr[l-1-i];
            arr [l-1-i] = tmp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

      /* another way to print the output is we can also use "for each loop" to print the output as below,
        for(int element : arr){
        System.out.print(element + " ");
        
        */
        

    }
}
