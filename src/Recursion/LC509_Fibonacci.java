package Recursion;

public class LC509_Fibonacci {
    static int fib1(int n){
        if(n<=1) return n;
        return fib1(n-1)+fib1(n-2);
    }
    void main(){
        System.out.println(fib1(0));
    }
}
