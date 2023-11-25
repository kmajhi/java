class Add {
    int sum;
    void add(int a, int b){
         sum = a+b;
        System.out.println(a+"+"+b+"="+sum);
    }
    void add(int a, int b, int c){
         sum = a+b+c;
        System.out.println(a+"+"+b+"+"+c+"="+sum);
    }

    void add(int a, int b, int c, int d, int e){
         sum = a+b+c+d+e;
        System.out.println(a+"+"+b+"+"+c+"+"+d+"+"+e+"="+sum);
    }
    void add(int a, int b, int c, int d, int e, int f){
        int sum = a+b+c+d+e+f;
        System.out.println(a+"+"+b+"+"+c+"+"+d+"+"+e+"+"+f+"="+sum);
    }
}
public class Solution {
    public static void main(String[] args) {
        Add ob = new Add();
        ob.add(1,2);
        ob.add(1,2,3);
        ob.add(1,2,3,4,5);
        ob.add(1,2,3,4,5,6);
    }
}


