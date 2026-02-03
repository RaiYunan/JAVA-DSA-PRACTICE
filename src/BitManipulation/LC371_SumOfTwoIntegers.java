package BitManipulation;

public class LC371_SumOfTwoIntegers {
    //this is simple interview friendly solution #simple iterative approach
    static int getSum1(int a,int b){
        while(b!=0){
            int carry=(a&b)<<1;
            a=a^b;
            b=carry;
        }
        return a;
    }

    //this is optimal solution using recursion same as above;
    static int getSum2(int a,int b){
        if(b==0) return a;
        return getSum2(a^b,(a&b)<<1);
    }

    public static void main(String[] args){
        int a=5,b=3;
        System.out.println(getSum1(a,b));
        System.out.println(getSum2(a,b));
    }
}
