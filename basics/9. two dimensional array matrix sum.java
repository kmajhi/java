public class Main {
    public static void main(String[] args) {
        int [][] mat1 ={{2,1,5},
                        {5,4,5}};

        int [][] mat2 = {{2,0,5},
                        {7,3,5}};

        int [][] result = {{0,0,0},{0,0,0}};

        for(int i=0; i<mat1.length; i++){
            for (int j=0; j<mat1[i].length; j++){
                result [i][j] = mat1[i][j]+ mat2[i][j];
            }

        }

        for(int i=0; i<mat1.length; i++){
            for (int j=0; j<mat1[i].length; j++){
                result [i][j] = mat1[i][j]+ mat2[i][j];
                System.out.print(result[i][j]+ " \t");
            }
            System.out.println(" ");

        }
    }
}
