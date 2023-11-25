class Add {
     void add(int ...arr){
        int sum=0;
        String s="";
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            s+=arr[i];
            if(i<arr.length-1)
                s+="+";
        }
        s+="="+sum;
        System.out.println(s);
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
