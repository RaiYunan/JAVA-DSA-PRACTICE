package Recursion;

public class LC50_PowerOfX {

    static double myPow(double x, int n) {
        long power = n;          // prevent overflow
        if (power < 0) {
            x = 1 / x;
            power = -power;
        }

        double result = 1;

        while (power > 0) {
            if ((power & 1) == 1) {
                result *= x;
            }
            x *= x;
            power >>= 1;
        }

        return result;
    }

    void main() {

        double x1 = 2;
        int n1 = 3;
        System.out.println(x1 + "^" + n1 + " = " + myPow(x1, n1));

        double x2 = 2;
        int n2 = -2;
        System.out.println(x2 + "^" + n2 + " = " + myPow(x2, n2));

        double x3 = 5;
        int n3 = 0;
        System.out.println(x3 + "^" + n3 + " = " + myPow(x3, n3));

        double x4 = 0;
        int n4 = 5;
        System.out.println(x4 + "^" + n4 + " = " + myPow(x4, n4));

        double x5 = -2;
        int n5 = 3;
        System.out.println(x5 + "^" + n5 + " = " + myPow(x5, n5));
    }
}