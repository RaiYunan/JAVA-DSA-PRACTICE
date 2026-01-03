package ArrayPrograms;

import java.util.Arrays;

public class LC_2149_RearrangeElementsBySign {
        static int[] rearrangeArray(int[] nums) {

            int n = nums.length;
            int[] result = new int[n];

            int posIndex = 0; // even indices
            int negIndex = 1; // odd indices

            for (int num : nums) {
                if (num > 0) {
                    result[posIndex] = num;
                    posIndex += 2;
                } else {
                    result[negIndex] = num;
                    negIndex += 2;
                }
            }

            return result;
        }
    public static void main(String[] args){
            int[] arr={-3,-2,1,3,4,};
        System.out.println(Arrays.toString(rearrangeArray(arr)));
    }

}
