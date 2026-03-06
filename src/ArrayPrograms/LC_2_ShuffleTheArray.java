package ArrayPrograms;

import java.util.Arrays;

public class LC_2_ShuffleTheArray {
        public int[] shuffle(int[] nums, int n) {
            int[] ans = new int[2 * n];
            int index = 0;

            for (int i = 0; i < n; i++) {
                ans[index++] = nums[i];
                ans[index++] = nums[i + n];
            }

            return ans;
        }
    void main(){
            int[] nums={2,5,1,3,4,7};
        System.out.println(shuffle(Arrays.toString(nums)));
    }
}
