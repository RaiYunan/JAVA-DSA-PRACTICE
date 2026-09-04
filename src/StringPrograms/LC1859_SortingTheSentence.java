package StringPrograms;

public class LC1859_SortingTheSentence {

    //  O(n) time | O(n) space
    static String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] result = new String[words.length];
        for (String word : words) {
            int pos = word.charAt(word.length() - 1) - '1';
            result[pos] = word.substring(0, word.length() - 1);
        }
        return String.join(" ", result);
    }

    void main() {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));    // This is a sentence
        System.out.println(sortSentence("Myself2 Me1 I4 and3"));       // Me Myself and I
    }
}
