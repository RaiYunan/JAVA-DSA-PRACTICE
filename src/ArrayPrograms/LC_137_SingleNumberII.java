package ArrayPrograms;

import java.util.Arrays;

public class LC_137_SingleNumberII {

    static int singleNumber1(int[] nums) {
        int result = 0;


        for (int i = 0; i < 32; i++) {
            int sum = 0;


            for (int num : nums) {
                if (((num >> i) & 1) == 1) {
                    sum++;
                }
            }

            if (sum % 3 != 0) {
                result |= (1 << i);
            }
        }

        return result;
    }

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
            System.out.println(singleNumber1(arr));
        }
}
