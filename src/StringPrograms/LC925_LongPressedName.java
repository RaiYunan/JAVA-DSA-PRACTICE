package StringPrograms;

public class LC925_LongPressedName {

    // two pointer - O(n) time | O(1) space
    static boolean isLongPressedName(String name, String typed) {
        int i = 0;
        for (int j = 0; j < typed.length(); j++) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) i++;
            else if (j == 0 || typed.charAt(j) != typed.charAt(j - 1)) return false;
        }
        return i == name.length();
    }

    void main() {
        System.out.println(isLongPressedName("alex", "aaleex"));   // true
        System.out.println(isLongPressedName("saeed", "ssaaedd")); // false
        System.out.println(isLongPressedName("leelee", "lleeelee")); // true
    }
}
