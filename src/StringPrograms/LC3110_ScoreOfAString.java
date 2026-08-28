package StringPrograms;

public class LC3110_ScoreOfAString {

    //  O(n) time | O(1) space
    static int scoreOfString(String s) {
        int score = 0;
        for (int i = 1; i < s.length(); i++) score += Math.abs(s.charAt(i) - s.charAt(i - 1));
        return score;
    }

    void main() {
        System.out.println(scoreOfString("hello")); // 13
        System.out.println(scoreOfString("zaz"));   // 50
    }
}