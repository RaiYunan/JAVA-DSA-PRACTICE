package ArrayPrograms;

public class ReverseInteger {
    static int reverse(int x){
        int reversed=0;
        while(x!=0){
            int digit=x%10;
            x=x/10;

            // Check for overflow before actually multiplying
            if (reversed > Integer.MAX_VALUE / 10 ||
                    (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (reversed < Integer.MIN_VALUE / 10 ||
                    (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
            reversed=reversed*10+digit;
        }
        return reversed;
    }
    public static void main(String[] args){
            System.out.println(reverse(123));      // 321
            System.out.println(reverse(-123));     // -321
            System.out.println(reverse(120));      // 21
            System.out.println(reverse(0));        // 0
            System.out.println(reverse(1534236469)); // 0 (overflow)
            System.out.println(reverse(-2147483648)); // 0 (overflow)

    }
}
