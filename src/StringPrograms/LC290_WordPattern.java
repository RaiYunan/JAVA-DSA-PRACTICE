package StringPrograms;

import java.util.HashMap;

public class LC290_WordPattern {

    /*
     * check if pattern bijectively maps to words in string s
     * 1. split s into words, check length matches pattern
     * 2. use two hashmaps for bidirectional mapping char↔word
     * 3. if any mapping conflict found, return false
     *
     * bidirectional hashmap
     * O(n) time, O(n) space
     */
    static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;

        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c      = pattern.charAt(i);
            String word = words[i];
            if (map1.containsKey(c)    && !map1.get(c).equals(word)) return false;
            if (map2.containsKey(word) &&  map2.get(word) != c)      return false;
            map1.put(c, word);
            map2.put(word, c);
        }

        return true;
    }

    void main() {
        System.out.println(wordPattern("abba", "dog cat cat dog")); // true
        System.out.println(wordPattern("abba", "dog cat cat fish")); // false
        System.out.println(wordPattern("aaaa", "dog cat cat dog")); // false
        System.out.println(wordPattern("abba", "dog dog dog dog")); // false
    }
}