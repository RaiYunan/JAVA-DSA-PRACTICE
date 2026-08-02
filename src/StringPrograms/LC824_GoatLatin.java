package StringPrograms;

public class LC824_GoatLatin {

    /*
     * convert sentence to goat latin (brute force)
     * rules: vowel-start → append "ma", consonant-start → move first char to end + "ma"
     * each word gets extra "a" suffix based on position (1-indexed)
     * 1. split by space, track suffix "a", "aa", "aaa"...
     * 2. check first char, apply rule, append "ma" + suffix
     *
     * string simulation (brute force)
     * O(n^2) time, O(n) space
     */
    static String toGoatLatin(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder ans = new StringBuilder();
        StringBuilder suffix = new StringBuilder("a");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (isVowel(word.charAt(0))) ans.append(word);
            else { ans.append(word.substring(1)); ans.append(word.charAt(0)); }
            ans.append("ma").append(suffix);
            if (i != words.length - 1) ans.append(" ");
            suffix.append("a");
        }
        return ans.toString();
    }

    static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    void main() {
        System.out.println(toGoatLatin("I speak Goat Latin"));
        // Imaa peaksmaaa oatGmaaaa atinLmaaaaa
        System.out.println(toGoatLatin("The quick brown fox jumped over the lazy dog"));
        // heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa
    }
}
