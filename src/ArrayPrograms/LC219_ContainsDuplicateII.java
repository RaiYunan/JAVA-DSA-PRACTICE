package ArrayPrograms;



public class LC219_ContainsDuplicateII {

    /*
     * check if any two equal elements are at most k indices apart
     * brute force: for each element, check next k elements for duplicate
     * O(n*k) time, O(1) space
     */
    static boolean containsNearbyDuplicateBruteForce(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++)
            for (int j = i + 1; j <= i + k && j < nums.length; j++)
                if (nums[i] == nums[j]) return true;
        return false;
    }


    void main() {
        System.out.println(containsNearbyDuplicateBruteForce(new int[]{1, 2, 3, 1}, 3));       // true
        System.out.println(containsNearbyDuplicateBruteForce(new int[]{1, 0, 1, 1}, 1));       // true
        System.out.println(containsNearbyDuplicateBruteForce(new int[]{1, 2, 3, 1, 2, 3}, 2)); // false
    }
}
