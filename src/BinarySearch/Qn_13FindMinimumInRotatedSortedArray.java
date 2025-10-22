package BinarySearch;

import java.util.Arrays;

public class Qn_13FindMinimumInRotatedSortedArray {
    static int findMin(int[] nums){
        int start=0,end=nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[end]){
                //Minimum is in right half;
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return nums[start];
    }
   public static void main(String[] args){
       int[] arr1={4, 5, 6, 7, 0, 1, 2, 3};
       int[] arr2={7,8,1,2,3,4,5,6};
       System.out.println("Minimum element in "+ Arrays.toString(arr1)+ " is "+findMin(arr1) );
       System.out.println("Minimum element in "+ Arrays.toString(arr2)+ " is "+findMin(arr2) );
   }
}
