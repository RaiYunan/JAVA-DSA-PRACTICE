package StringPrograms;

public class LC1556_ThousandSeparator {
   // O(n) time | O(n) space
    static String thousandSeparator(int n) {
        String s = String.valueOf(n);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && (s.length() - i) % 3 == 0) result.append('.');
            result.append(s.charAt(i));
        }
        return result.toString();
    }

    void main() {
        System.out.println(thousandSeparator(987));      // 987
        System.out.println(thousandSeparator(1234));     // 1.234
        System.out.println(thousandSeparator(123456789)); // 123.456.789
    }
}
