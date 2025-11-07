package ArrayPrograms;

import java.util.Arrays;

//Example 1:
//
//Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]
//Example 2:
//
//Input: nums = [0]
//Output: [0]
public class MoveZeros_LQ283_Easy {
    static void moveZeroes(int[] nums){
        int n=nums.length;
        int nonZeroIndex=0;
        // Move all non-zero elements to the front
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[nonZeroIndex++]=nums[i];
            }
        }
        // Fill remaining positions with zeros
        for(int i=nonZeroIndex;i<n;i++){
            nums[i]=0;
        }
    }
    public static void main(String[] args){
        int[] nums={0,1,0,3,0,12,0,0,1,2,3,0};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));

    }
}
