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
    public static void main(String[] args){
        System.out.println(isPerfectSquare_BruteForce(16));
        System.out.println(isPerfectSquare_BruteForce(14));
    }
}
