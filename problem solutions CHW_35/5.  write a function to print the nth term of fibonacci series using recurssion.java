// write a function to print the nth term of fibonacci series using recurssion

public class Main {
    static int fib(int n) {
        if(n==0){
            return 0;
        }
        else if (n == 1 || n == 2) {
            return n - 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
        public static void main (String[]args){
        int c = fib(50);
            System.out.println(c);
        }
    }
