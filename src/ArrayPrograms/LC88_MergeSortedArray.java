package ArrayPrograms;

public class LC88_MergeSortedArray {
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1, p2 = n - 1, p = m + n - 1;

        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) nums1[p--] = nums1[p1--];
            else                                   nums1[p--] = nums2[p2--];
        }
    }

    static String print(int[] nums) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < nums.length; i++) sb.append(nums[i]).append(i < nums.length - 1 ? ", " : "]");
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        merge(nums1, 3, new int[]{2, 5, 6}, 3);
        System.out.println(print(nums1));

    }
}
