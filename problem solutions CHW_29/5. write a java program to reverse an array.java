public class Main {
    public static void main(String[] args) {
        int [] arr = { 1,2,3,4,5,6};

        int l = arr.length;
        int n = Math.floorDiv(l,2);
        int tmp;

        for(int i= 0; i<n; i++){
            tmp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-1-i] = tmp;
        }

        for(int i= 0; i<arr.length; i++){
            System.out.print (arr[i]+ " ");
        }
    }
}
