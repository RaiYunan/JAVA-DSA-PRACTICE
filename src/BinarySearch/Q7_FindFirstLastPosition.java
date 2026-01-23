package BinarySearch;

import java.util.Arrays;

public class Q7_FindFirstLastPosition {
    static int[] Search(int[] nums,int target){
        return new int[] {BinSearch(nums,target,true),BinSearch(nums,target,false)};
    }
    static int BinSearch(int[] nums,int target,boolean findFirstIndex){
        int result=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==nums[mid]){
                result=mid;
                if(findFirstIndex){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            } else if (target>nums[mid]) {
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        return result;

    }


    public static void main(String[] args){
        int[] nums={2,3,7,7,7,8,8,10};
        int target=7;
        System.out.println(Arrays.toString(Search(nums,target)));

    }
}
