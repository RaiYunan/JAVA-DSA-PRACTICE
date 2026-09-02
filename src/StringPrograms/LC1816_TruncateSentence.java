package StringPrograms;

public class LC1816_TruncateSentence {

    // O(n) time | O(n) space
    static String truncateSentence(String s, int k) {
        int spaces = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                spaces++;
                if (spaces == k) return s.substring(0, i);
            }
        }
        return s;
    }

    void main() {
        System.out.println(truncateSentence("Hello how are you Contestant", 4)); // Hello how are you
        System.out.println(truncateSentence("What is the solution to this problem", 4)); // What is the solution
        System.out.println(truncateSentence("chopper is not a tanuki", 5)); // chopper is not a tanuki
    }
}
