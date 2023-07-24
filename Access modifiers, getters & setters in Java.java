class MyEmployee{
    private int id;
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        this.id = i;
    }
}
public class Main{
    public static void main(String[] args) {

        MyEmployee sujon = new MyEmployee();
//        sujon.id = 39;
//        sujon.name = "Majhi";--> Throws an erorr due to private access modifier

        sujon.setName("Sujon");
        sujon.setId(39);
        System.out.println("ID: "+ sujon.getId());
        System.out.println("Name: "+ sujon.getName());
    }
}
