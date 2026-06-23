package StringPrograms;

public class LC1935_MaximumNumberOfWordsYouCanType {

    /*
     * count words that can be typed without using broken letters
     * 1. split text into words
     * 2. check each character of every word
     * 3. skip the word if a broken letter is found
     * 4. otherwise, count the word
     *
     * time: O(n × m)
     * space: O(n)
     */
    static int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int count = 0;

        for (String word : words) {
            boolean canType = true;

            for (char ch : word.toCharArray()) {
                if (brokenLetters.indexOf(ch) != -1) {
                    canType = false;
                    break;
                }
            }

            if (canType) {
                count++;
            }
        }

        return count;
    }

     void main() {
        System.out.println(canBeTypedWords("hello world", "ad"));
        System.out.println(canBeTypedWords("leet code", "lt"));
        System.out.println(canBeTypedWords("leet code", "e"));
    }
}