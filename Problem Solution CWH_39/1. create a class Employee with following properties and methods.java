class Employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
public class Main {
    public static void main(String[] args) {
        Employee sujon = new Employee();

        sujon.salary = 60;
        sujon.setName("Sujon Mahamud");
      
        System.out.println(sujon.getSalary());
        System.out.println(sujon.getName());
    }
}
