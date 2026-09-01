package StringPrograms;

public class LC2278_PercentageOfLetterInString {

    // O(n) time | O(1) space
    static int percentageLetter(String s, char letter) {
        int count = 0;
        for (char c : s.toCharArray()) if (c == letter) count++;
        return count * 100 / s.length();
    }

    void main() {
        System.out.println(percentageLetter("foobar", 'o')); // 33
        System.out.println(percentageLetter("jjjj", 'k'));   // 0
        System.out.println(percentageLetter("aaa", 'a'));    // 100
    }
}
