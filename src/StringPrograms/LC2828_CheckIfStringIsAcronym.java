package StringPrograms;

import java.util.List;

public class LC2828_CheckIfStringIsAcronym {

    // match first char of each word to s | O(n) time | O(1) space
    static boolean isAcronym(List<String> words, String s) {
        if (words.size() != s.length()) return false;
        for (int i = 0; i < words.size(); i++)
            if (words.get(i).charAt(0) != s.charAt(i)) return false;
        return true;
    }

    void main() {
        System.out.println(isAcronym(List.of("alice", "bob", "charlie"), "abc")); // true
        System.out.println(isAcronym(List.of("an", "apple"), "a"));               // false
        System.out.println(isAcronym(List.of("never", "give", "up"), "ngu"));     // true
    }
}