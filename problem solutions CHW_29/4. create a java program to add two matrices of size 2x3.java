public class Main {
    public static void main(String[] args) {
        int [][] arr1 = {{1,2,3},
                         {4,5,6}};
        int [][] arr2 = {{2,6,13},
                         {3,7,1}};
        int [][] sum = {{0,0,0},
                        {0,0,0}};
      
        for (int i=0; i<arr1.length; i++){
            for(int j= 0; j<arr1[i].length; j++){
                sum [i][j]= arr1[i][j]+ arr2[i][j];
            }
        }
        for (int i=0; i<arr1.length; i++){
            for(int j= 0; j<arr1[i].length; j++){
                System.out.print(sum[i][j]+ " ");
            }
            System.out.println(" ");
        }
    }
}
