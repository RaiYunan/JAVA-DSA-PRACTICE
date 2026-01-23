package StringPrograms;

public class LC_334_ReverseString_BruteForce {
    static void reverseString(char[] s) {
        // Edge case: null or empty array
        if (s == null || s.length <= 1) {
            return;
        }

        int left = 0;
        int right = s.length - 1;

        // Swap characters from both ends moving toward center
        while (left < right) {
            // Swap using a temporary variable
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            // Move pointers
            left++;
            right--;
        }
    }
    public static void main(String[] args) {

        // Test Case 1
        char[] s1 = {'h', 'e', 'l', 'l', 'o'};
        System.out.print("Test 1 - Before: ");
        System.out.println(s1);
        reverseString(s1);
        System.out.print("After: ");
        System.out.println(s1);

        // Test Case 2
        char[] s2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        System.out.print("\nTest 2 - Before: ");
        System.out.println(s2);
        reverseString(s2);
        System.out.print("After: ");
        System.out.println(s2);

        // Test Case 3: Single character
        char[] s3 = {'A'};
        System.out.print("\nTest 3 - Single char: ");
        System.out.println(s3);
        reverseString(s3);
        System.out.print("After: ");
        System.out.println(s3);

        // Test Case 4: Even length
        char[] s4 = {'a', 'b', 'c', 'd'};
        System.out.print("\nTest 4 - Before: ");
        System.out.println(s4);
        reverseString(s4);
        System.out.print("After: ");
        System.out.println(s4);
    }
}
