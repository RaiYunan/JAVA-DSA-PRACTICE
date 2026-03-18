package Stack;

import java.util.Arrays;

public class LC496_NextGreaterElementI {
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {

            int[] result = new int[nums1.length];

            for(int i = 0; i < nums1.length; i++){

                int index = -1;

                // find position in nums2
                for(int j = 0; j < nums2.length; j++){
                    if(nums2[j] == nums1[i]){
                        index = j;
                        break;
                    }
                }

                // find next greater
                int nextGreater = -1;
                for(int j = index + 1; j < nums2.length; j++){
                    if(nums2[j] > nums1[i]){
                        nextGreater = nums2[j];
                        break;
                    }
                }

                result[i] = nextGreater;
            }

            return result;
        }

    void main(){
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));
    }
}

