package StringPrograms;
public class LC2264_LargestThreeSameDigitNumberInString {

    // O(n) time | O(1) space
    static String largestGoodInteger(String num) {
        char best = 0;
        for (int i = 0; i < num.length() - 2; i++)
            if (num.charAt(i) == num.charAt(i + 1) && num.charAt(i) == num.charAt(i + 2))
                best = (char) Math.max(best, num.charAt(i));
        return best == 0 ? "" : "" + best + best + best;
    }

    void main() {
        System.out.println(largestGoodInteger("6777133339")); // 777
        System.out.println(largestGoodInteger("2300019"));    // 000
        System.out.println(largestGoodInteger("42352338"));   // ""
    }
}
