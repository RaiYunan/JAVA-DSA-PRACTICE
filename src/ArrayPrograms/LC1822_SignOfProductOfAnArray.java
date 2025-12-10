package ArrayPrograms;

public class LC1822_SignOfProductOfAnArray {

    // Returns the sign of the product of the array values
    static int signArray(int[] nums) {

        int sign = 1; // Start assuming product is positive

        for (int num : nums) {

            if (num == 0) {
                // If any number is zero, entire product becomes zero
                return 0;
            }

            if (num < 0) {
                // Flip the sign whenever we see a negative number
                sign = -sign;
            }
        }


        return sign;
    }

    public static void main(String[] args) {
        int[] arr = {-1, -2, -3, -4, 3, 2, 1};
        System.out.println(signArray(arr));
    }
}
