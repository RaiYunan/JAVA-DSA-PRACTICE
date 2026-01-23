package ArrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_350_IntersectionOfTwoArrays2nd {

        static int[] intersect(int[] nums1, int[] nums2) {

            List<Integer> result = new ArrayList<>();
            boolean[] used = new boolean[nums2.length];

            for (int k : nums1) {
                for (int j = 0; j < nums2.length; j++) {
                    if (k == nums2[j] && !used[j]) {
                        result.add(k);
                        used[j] = true; // mark as used
                        break;
                    }
                }
            }

            int[] ans = new int[result.size()];
            for (int i = 0; i < result.size(); i++) {
                ans[i] = result.get(i);
            }

            return ans;
        }
    public static void main(String[] args){
            int[] nums1={1,2,2,1};
            int[] nums2={2,2};
            System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }

}
