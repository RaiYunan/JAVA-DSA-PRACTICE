package ArrayPrograms;

import java.util.Arrays;

public class LC_137_SingleNumberII {

        static int singleNumber(int[] nums) {
            Arrays.sort(nums);
            int n = nums.length;


            for (int i = 0; i < n - 1; i += 3) {
                if (nums[i] != nums[i + 1]) {
                    return nums[i];
                }
            }


            return nums[n - 1];
        }

        public static void main(String[] args){
            int[] arr={2,2,1,2};
            System.out.println(singleNumber(arr));
        }
}
