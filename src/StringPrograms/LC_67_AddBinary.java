package StringPrograms;

public class LC_67_AddBinary {
    static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;  // Start from end of a
        int j = b.length() - 1;  // Start from end of b
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0';  // Convert char to int
                i--;
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            // Add current bit (0 or 1)
            result.append(sum % 2);
            // Calculate carry for next position
            carry = sum / 2;
        }

        // Reverse because we built from right to left
        return result.reverse().toString();
    }
    public static void main(String[] args) {
        // Test cases
        System.out.println(addBinary("11", "1"));      // "100"
        System.out.println(addBinary("1010", "1011")); // "10101"
        System.out.println(addBinary("0", "0"));       // "0"
        System.out.println(addBinary("111", "111"));   // "1110"
    }
}
