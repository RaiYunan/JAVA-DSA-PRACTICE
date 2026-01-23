package BinarySearch;

public class Q8_FindElementInfiniteArray {
    static int findPos(int[] nums,int target){
        int start=0,end=1;

        while(target>nums[end]){
            int newStart=end+1;
            end=end+(end-start+1)*2;
            start=newStart;

        }
        return binarySearch(nums,target,start,end);
    }
    static int binarySearch(int[] nums, int target, int start, int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>nums[mid]){
                start=mid+1;
            } else if (target<nums[mid]) {
                end=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] nums={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14,15};
        int target=15;
        System.out.println(findPos(nums,target));
    }
}
