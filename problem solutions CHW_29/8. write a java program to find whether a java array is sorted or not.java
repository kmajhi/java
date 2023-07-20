public class Main {
    public static void main(String[] args) {
        int [] arr = {20,43,90,62,80};
        boolean IsInSorted = true;

        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                IsInSorted = false;
                break;
            }
        }
        
        if(IsInSorted){
            System.out.println("The array is sorted");
        } else {
            System.out.println("The array is not sorted");
        }
    }
}
