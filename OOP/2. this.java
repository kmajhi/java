class EClass{
    int a;
    public int getA() {
        return a;
    }

    EClass(int a){
       this.a = a;
    }

//    public int ReturnOne(){
//        return 1;
//    }
    // use of this 
}
public class Main{
    public static void main(String[] args) {
        EClass e = new EClass(5);
        System.out.println(e.getA());
    }
}
