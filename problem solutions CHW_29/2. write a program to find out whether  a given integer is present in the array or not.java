public class Main{
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4,5, 6,9};
        int num =  1;
        boolean IsInArray = false;

        for ( int i= 0; i<arr.length; i++){
            if(num==arr[i]){
                IsInArray = true;
                break;
            }
        }
        if(IsInArray){
            System.out.println("Array number is present in the array");
        }
        else{
            System.out.println("The number is not present in the array");
        }

    }
}
