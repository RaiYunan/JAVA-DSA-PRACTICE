package StringPrograms;


public class LC917_ReverseOnlyLetters {

    // brute force - collect letters, reverse, refill around non-letters | O(n) time | O(n) space
    static String reverseOnlyLetters(String s) {
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

    void main() {
        System.out.println(reverseOnlyLetters("ab-cd"));            // dc-ba
        System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));    // j-Ih-gfE-dCba
        System.out.println(reverseOnlyLetters("Test1ng-Leet=code-Q!")); // Qedo1ct-eeLg=ntse-T!
    }
}