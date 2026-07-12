package ArrayPrograms;


import java.util.HashMap;

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

    /*
     * sliding window hashmap: track last seen index of each number
     * 1. store each num's last index in map
     * 2. if num seen before and index diff <= k, return true
     * 3. update map with current index
     *
     * sliding window + hashmap
     * O(n) time, O(k) space
     */
    static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) return true;
            map.put(nums[i], i);
        }
        return false;
    }


    void main() {
        System.out.println(containsNearbyDuplicateBruteForce(new int[]{1, 2, 3, 1}, 3));
        System.out.println(containsNearbyDuplicateBruteForce(new int[]{1, 0, 1, 1}, 1));
        System.out.println(containsNearbyDuplicateBruteForce(new int[]{1, 2, 3, 1, 2, 3}, 2));


        System.out.println(containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
        System.out.println(containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
        System.out.println(containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));
    }
}
