package StringPrograms;

public class LC165_CompareVersionNumbers {

    // brute force - split + parse | O(n) time | O(n) space
    static int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int n = Math.max(v1.length, v2.length);
        for (int i = 0; i < n; i++) {
            int num1 = i < v1.length ? Integer.parseInt(v1[i]) : 0;
            int num2 = i < v2.length ? Integer.parseInt(v2[i]) : 0;
            if (num1 < num2) return -1;
            if (num1 > num2) return  1;
        }
        return 0;
    }

    void main() {
        System.out.println(compareVersion("1.2", "1.10")); // -1
        System.out.println(compareVersion("1.01", "1.1")); // 0
        System.out.println(compareVersion("1.0", "1.0.0.0")); // 0
        System.out.println(compareVersion("2.0", "1.9")); // 1
    }
}