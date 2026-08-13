package StringPrograms;

import java.util.HashMap;

public class LC290_WordPattern {
    /*
     * check bijective mapping by comparing all previous pairs (brute force)
     * 1. for each i, scan all j < i for pattern and word conflicts
     * 2. same pattern char must map to same word and vice versa
     *
     * nested loop comparison
     * O(n^2) time, O(1) space
     */
    static boolean wordPatternBrute(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;
        for (int i = 0; i < pattern.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (pattern.charAt(i) == pattern.charAt(j) && !words[i].equals(words[j])) return false;
                if (words[i].equals(words[j]) && pattern.charAt(i) != pattern.charAt(j)) return false;
            }
        }
        return true;
    }


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
            char c = pattern.charAt(i);
            String word = words[i];
            if (map1.containsKey(c) && !map1.get(c).equals(word)) return false;
            if (map2.containsKey(word) && map2.get(word) != c) return false;
            map1.put(c, word);
            map2.put(word, c);
        }

        return true;
    }

    void main() {
        System.out.println(wordPatternBrute("abba", "dog cat cat dog")); // true
        System.out.println(wordPatternBrute("abba", "dog cat cat fish")); // false
        System.out.println(wordPatternBrute("aaaa", "dog cat cat dog")); // false
        System.out.println(wordPattern("abba", "dog cat cat dog")); // true
        System.out.println(wordPattern("abba", "dog cat cat fish")); // false
        System.out.println(wordPattern("aaaa", "dog cat cat dog")); // false
        System.out.println(wordPattern("abba", "dog dog dog dog")); // false
    }
}