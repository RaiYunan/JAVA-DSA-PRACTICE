package BinarySearch;

public class LC367_ValidPerfectSquare {
    //Brute Force Method
    static boolean isPerfectSquare_BruteForce(int num){
        if (num < 1) return false;

        for (long i = 1; i * i <= num; i++) {
            if (i * i == num) {
                return true;
            }
        }
        return false;
    }
    static boolean isPerfectSquare(int num) {
        if (num < 1) return false;

        long left = 1, right = num;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == num) return true;
            else if (square < num) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println(isPerfectSquare_BruteForce(16));
        System.out.println(isPerfectSquare_BruteForce(14));

        System.out.println(isPerfectSquare(16));
        System.out.println(isPerfectSquare(14));
    }
}
