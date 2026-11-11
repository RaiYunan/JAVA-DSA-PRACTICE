package Math;

public class LC836_RectangleOverlap {

    // O(1) time | O(1) space
    static boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return rec1[0] < rec2[2] &&
                rec1[2] > rec2[0] &&
                rec1[1] < rec2[3] &&
                rec1[3] > rec2[1];
    }

    void main() {
        System.out.println(isRectangleOverlap(new int[]{0, 0, 2, 2}, new int[]{1, 1, 3, 3})); // true
        System.out.println(isRectangleOverlap(new int[]{0, 0, 1, 1}, new int[]{1, 0, 2, 1})); // false
        System.out.println(isRectangleOverlap(new int[]{0, 0, 1, 1}, new int[]{2, 2, 3, 3})); // false
    }
}