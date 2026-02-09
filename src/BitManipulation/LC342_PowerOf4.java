package BitManipulation;

public class LC342_PowerOf4 {
    static boolean isPpwerOfFour(int n){
        if (n <= 0) return false;

        long power = 1;
        while (power < n) {
            power *= 4;
        }
        return power == n;
    }
    public static void main(String[] args){
        int num1=16;
        System.out.println(isPpwerOfFour(num1));
        int num2=8;
        System.out.println(isPpwerOfFour(num2));
    }
}
