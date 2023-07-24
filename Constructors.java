class Employee{
    private int id;
    private String name;

//    public Employee(){
//        id = 42;
//        name = "Your-Name-Here";
//    }

    public Employee(String myName, int myId){
        id = myId;
        name = myName;
    }

    public void setId(int i){
        this.id = i;
    }
    public void setName(String n){
        this.name =n;
    }
    public int getId(){
        return id;
    }
    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee sujon = new Employee("Sujon", 39);
//        sujon.setName("Sujon");
//        sujon.setId(39);
        System.out.println(sujon.getName());
        System.out.println(sujon.getId());
    }
}
