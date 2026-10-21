package StringPrograms;

public class LC2710_RemoveTrailingZerosFromAString {

    // brute force - O(n^2) time | O(n) space
    static String removeTrailingZerosBrute(String num) {
        while (num.endsWith("0")) num = num.substring(0, num.length() - 1);
        return num;
    }

    // StringBuilder method - O(n) time | O(n) space
    static String removeTrailingZerosBuilder(String num) {
        StringBuilder sb = new StringBuilder(num);
        while (sb.charAt(sb.length() - 1) == '0') sb.setLength(sb.length() - 1);
        return sb.toString();
    }

    // optimal - O(n) time | O(n) space
    static String removeTrailingZeros(String num) {
        int i = num.length() - 1;
        while (num.charAt(i) == '0') i--;
        return num.substring(0, i + 1);
    }

    // regex - O(n) time | O(n) space
    static String removeTrailingZerosRegex(String num) {
        return num.replaceAll("0+$", "");
    }

    void main() {
        System.out.println(removeTrailingZerosBrute("51230100"));   // 512301
        System.out.println(removeTrailingZerosBuilder("51230100")); // 512301
        System.out.println(removeTrailingZeros("51230100"));        // 512301
        System.out.println(removeTrailingZerosRegex("51230100"));   // 512301

        System.out.println(removeTrailingZeros("123"));             // 123
    }
}