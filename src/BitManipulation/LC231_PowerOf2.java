package BitManipulation;

public class LC231_PowerOf2 {

    // A number is power of two if:
    // 1) n > 0
    // 2) it has exactly one set bit
    static boolean isPowerOfTwo1(int n) {

        // n & (n-1) removes the lowest set bit
        // For powers of two, result becomes 0
        return n > 0 && (n & (n - 1)) == 0;
    }
    static boolean isPowerOfTwo2(int n) {
        if (n <= 0) return false;
        while (n % 2 == 0) n /= 2;
        return n == 1;
    }

    public static void main(String[] args) {
        int num1 = 128; // 10000000 -> true
        int num2 = 3;   // 00000011 -> false

        System.out.println(isPowerOfTwo1(num1));
        System.out.println(isPowerOfTwo2(num2));
    }
}
