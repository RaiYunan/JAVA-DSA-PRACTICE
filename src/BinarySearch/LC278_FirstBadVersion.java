package BinarySearch;

public class LC278_FirstBadVersion {

    // simulating VersionControl base class
    static int firstBad = 4;
    static boolean isBadVersion(int version) { return version >= firstBad; }

    // binary search.. O(log n) time | O(1) space
    static int firstBadVersion(int n) {
        int left = 1, right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) right = mid;
            else                   left  = mid + 1;
        }
        return left;
    }

    void main() {
        firstBad = 4;
        System.out.println(firstBadVersion(5)); // 4

        firstBad = 1;
        System.out.println(firstBadVersion(1)); // 1

        firstBad = 2;
        System.out.println(firstBadVersion(5)); // 2
    }
}
