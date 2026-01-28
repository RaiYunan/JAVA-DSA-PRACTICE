package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class LC_451_SortCharactersByFrequency {

        static String frequencySort(String s) {
            Map<Character, Integer> map = new HashMap<>();

            // Count frequency
            for (char c : s.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            StringBuilder result = new StringBuilder();

            while (!map.isEmpty()) {
                char maxChar = ' ';
                int maxFreq = 0;

                // Find max frequency character
                for (char c : map.keySet()) {
                    if (map.get(c) > maxFreq) {
                        maxFreq = map.get(c);
                        maxChar = c;
                    }
                }

                // Append it
                for (int i = 0; i < maxFreq; i++) {
                    result.append(maxChar);
                }

                map.remove(maxChar);
            }

            return result.toString();
        }

    public static void main(String[] args){
        System.out.println(frequencySort("tree"));
    }
}
