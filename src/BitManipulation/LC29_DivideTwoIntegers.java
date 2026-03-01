package BitManipulation;

public class LC29_DivideTwoIntegers {
    static int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);

        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;
        int quotient = 0;

        for (int i = 31; i >= 0; i--) {
            if ((dvd >> i) >= dvs) {
                quotient += (1 << i);
                dvd -= (dvs << i);
            }
        }

        return sign * quotient;
    }
    void main(){
        int num1=15;
        int num2=4;
        System.out.println(divide(num1,num2));
    }
}
