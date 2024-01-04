import java.io.File;

public class Solution {
    public static void main(String[] args) {

        File dir = new File("Programming");
        dir.mkdir();

        String location = dir.getAbsolutePath();
        System.out.println(location);

        File file1 = new File(location+ "/goLang.txt");
        File file2 = new File(location+"/python.txt");

        try{
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("files are created");
        }catch (Exception e){
            System.out.println(e);
        }
        if (file1.exists()){
            System.out.println(file1.getName()+ " Exists");
        } else{
            System.out.println(file1.getName()+ "Does not exist");
        }

    }
}
