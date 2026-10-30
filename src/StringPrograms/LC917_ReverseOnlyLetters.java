package StringPrograms;

public class LC917_ReverseOnlyLetters {

    // brute force - O(n) time | O(n) space
    static String reverseOnlyLettersBrute(String s) {
        StringBuilder letters = new StringBuilder();
        for (char c : s.toCharArray()) if (Character.isLetter(c)) letters.append(c);
        letters.reverse();
        StringBuilder result = new StringBuilder();
        int j = 0;
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) result.append(letters.charAt(j++));
            else                       result.append(c);
        }
        return result.toString();
    }

    // optimal - two pointer O(n) time | O(n) space
    static String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            if (!Character.isLetter(chars[left]))       left++;
            else if (!Character.isLetter(chars[right])) right--;
            else {
                char temp      = chars[left];
                chars[left++]  = chars[right];
                chars[right--] = temp;
            }
        }
        return new String(chars);
    }

    void main() {
        System.out.println(reverseOnlyLettersBrute("ab-cd"));                 // dc-ba
        System.out.println(reverseOnlyLettersBrute("a-bC-dEf-ghIj"));         // j-Ih-gfE-dCba
        System.out.println(reverseOnlyLettersBrute("Test1ng-Leet=code-Q!"));  // Qedo1ct-eeLg=ntse-T!

        System.out.println(reverseOnlyLetters("ab-cd"));
        System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
        System.out.println(reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }
}