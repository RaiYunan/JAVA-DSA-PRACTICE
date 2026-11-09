package ArrayPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LC1207_UniqueNumberOfOccurrences {

    // O(n) time | O(n) space
    static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for (int num : arr) map.put(num, map.getOrDefault(num, 0) + 1);
        for (int count : map.values()) if (!set.add(count)) return false;
        return true;
    }

    void main() {
        System.out.println(uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3}));                          // true
        System.out.println(uniqueOccurrences(new int[]{1, 2}));                                      // false
        System.out.println(uniqueOccurrences(new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0}));          // true
    }
}