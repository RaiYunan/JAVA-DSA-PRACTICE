package BinarySearch;

public class Qn12_SearchInRotatedSortedArrayWithDuplicateValues {
    static boolean search(int[] nums,int target){
        int start=0,end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            // Case 1: Found the target
            if(target==nums[mid]){
                return true;
            }
            // Handle duplicates - USE CONTINUE
            if(nums[start]==nums[mid] && nums[mid]==nums[end]){
                start++;
                end--;
                continue;
            }
            if(nums[start]<=nums[mid]){
                //left half is properly sorted
                if(nums[start]<=target && target<nums[mid]){
                    end=mid-1;//target is in left half
                }else{
                    start=mid+1;//target is in right half
                }
            }else{
                //right half is properly sorted;
                if(nums[mid]<target && target<=nums[end]){
                    start=mid+1;//target is in right half
                }else{
                    end=mid-1;//target is in left half
                }
            }

        }
        return false;
    }
    public static void main(String[] args) {
        // Test cases with duplicates
        int[] arr1 = {2, 5, 6, 0, 0, 1, 2};
        int target1 = 0;
        System.out.println("Search " + target1 + " in [2,5,6,0,0,1,2]: " + search(arr1, target1));

        int[] arr2 = {1, 0, 1, 1, 1};
        int target2 = 0;
        System.out.println("Search " + target2 + " in [1,0,1,1,1]: " + search(arr2, target2));

        int[] arr3 = {1, 1, 1, 1, 1, 1, 1};
        int target3 = 2;
        System.out.println("Search " + target3 + " in [1,1,1,1,1,1,1]: " + search(arr3, target3));
    }
}
