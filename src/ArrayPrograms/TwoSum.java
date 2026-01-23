package ArrayPrograms;
//https://leetcode.com/problems/two-sum/

import java.util.Arrays;

public class TwoSum {
    static int[] twoSum(int[] nums,int target){
        for(int i=0;i<nums.length-1;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }
    public static void main(String[] args){
        int[] nums={2,7,11,15};
        int target=26;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
}
