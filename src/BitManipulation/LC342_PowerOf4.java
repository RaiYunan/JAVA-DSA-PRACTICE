package BitManipulation;


public class LC342_PowerOf4 {
    static boolean isPowerOfFour1(int n){
        if (n <= 0) return false;

        long power = 1;
        while (power < n) {
            power *= 4;
        }
        return power == n;
    }

    //recusrsive approach...
    static boolean isPowerOfFour2(int n){
        // Base cases
        if (n <= 0) return false;
        if (n == 1) return true;
        if (n % 4 != 0) return false;

        // Recursive case
        return isPowerOfFour2(n / 4);
    }
    static boolean isPowerOfFour3(int n){
        if (n <= 0) return false;

        while (n % 4 == 0) {
            n /= 4;
        }

        return n == 1;
    }
    static void main(){
        int num1=16;
        System.out.println(isPowerOfFour1(num1));
        System.out.println(isPowerOfFour2(num1));
        int num2=8;
        System.out.println(isPowerOfFour2(num2));
        System.out.println(isPowerOfFour3(num2));
    }
    }


