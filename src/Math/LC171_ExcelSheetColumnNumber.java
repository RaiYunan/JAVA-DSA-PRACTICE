package Math;

public class LC171_ExcelSheetColumnNumber {

    // O(n) time | O(1) space
    static int titleToNumberBrute(String columnTitle) {
        int result = 0, n = columnTitle.length();
        for (int i = 0; i < n; i++)
            result += (int) ((columnTitle.charAt(i) - 'A' + 1) * Math.pow(26, n - i - 1));
        return result;
    }

    void main() {
        System.out.println(titleToNumberBrute("A"));    // 1
        System.out.println(titleToNumberBrute("AB"));   // 28
        System.out.println(titleToNumberBrute("ZY"));   // 701
    }
}
