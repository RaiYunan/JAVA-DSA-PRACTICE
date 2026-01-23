package BinarySearch;

public class Q9_FindMountainPeak {
  static int findPeak(int[] nums){
      int start=0,end=nums.length-1;
      while(start<end){
          int mid=start+(end-start)/2;
          if (nums[mid]>nums[mid+1]) {
              end=mid;
          } else if (nums[mid]<nums[mid+1]) {
              start=mid+1;

          }
      }
      return end;
  }
    public static void main(String[] args){
        int[] nums={1,2,3,5,6,41,43,222};
        System.out.println(findPeak(nums));
    }
}
