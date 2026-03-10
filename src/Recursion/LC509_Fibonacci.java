package Recursion;

public class LC509_Fibonacci {
    static int fib1(int n){// Recursive approach but slower than iterative one
        if(n<=1) return n;
        return fib1(n-1)+fib1(n-2);
    }
    static int fib2(int n){// Most optimal solution
        if(n<=1) return n;
        int a=0;
        int b=1;
        for(int i = 2; i <= n; i++){
            int c = a + b;
            a = b;
            b = c;
        }

        return b;
    }
    void main(){
        System.out.println(fib1(4));
        System.out.println(fib2(4));
    }
}
