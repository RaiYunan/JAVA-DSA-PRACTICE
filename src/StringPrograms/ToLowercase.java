package StringPrograms;

public class ToLowercase {

    // Convert all uppercase letters in the string to lowercase (without using built-in toLowerCase)
    static String toLowerCase(String s) {
        // Convert string to char array for in-place modification
        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            // Check if character is uppercase A-Z
            if (charArray[i] >= 'A' && charArray[i] <= 'Z') {
                // Convert to lowercase by adding 32 (ASCII difference)
                charArray[i] += 32;
            }
        }

        // Build new string from modified char array
        return new String(charArray);
    }

    public static void main(String[] args) {
        // Basic test cases
        String s1 = "YunanRai";
        String s2 = "HELLO";
        String s3 = "alreadyLower";
        String s4 = "MiXeD123!";
        String s5 = "";            // empty string
        String s6 = "ABCxyz";      // mix of upper and lower

        System.out.println(toLowerCase(s1)); // yunanrai
        System.out.println(toLowerCase(s2)); // hello
        System.out.println(toLowerCase(s3)); // alreadylower
        System.out.println(toLowerCase(s4)); // mixed123!
        System.out.println(toLowerCase(s5)); // (prints empty line)
        System.out.println(toLowerCase(s6)); // abcxyz
    }
}
