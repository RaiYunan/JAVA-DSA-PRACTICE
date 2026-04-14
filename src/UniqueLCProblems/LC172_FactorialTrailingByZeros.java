package UniqueLCProblems;

public class LC172_FactorialTrailingByZeros {
    static  int trailingZeroes(int n) {
        int count=0;

        while(n>=5){
            n/=5;
            count+=n;
        }
        return count;
    }
    void main(){
        System.out.println(trailingZeroes(0));
        System.out.println(trailingZeroes(5));
        System.out.println(trailingZeroes(15));
        System.out.println(trailingZeroes(26));
    }
}
