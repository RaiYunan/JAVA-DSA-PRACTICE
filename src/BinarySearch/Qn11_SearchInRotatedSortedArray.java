package BinarySearch;

public class Qn11_SearchInRotatedSortedArray {
    static int findPivot(int[] arr){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(start<mid && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[start]>=arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
    static int binarySearch(int[] nums,int target,int start,int end){
        if(target>nums[end]) return -1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==nums[mid]){
                return mid;
            } else if (target>nums[mid]) {
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={3,4,6,7,8,0,1,2};
        int target=2;
        int pivot=findPivot(arr);
        int start=0,end=arr.length-1;
        if(pivot==-1){
            System.out.println(binarySearch(arr,target,start,end));
        }
        if(target==arr[pivot]){
            System.out.println(pivot);
        }

        if(target>=arr[start]){
            System.out.println(binarySearch(arr,target,start,pivot-1));

        }else{
            System.out.println(binarySearch(arr,target,pivot+1,end));
        }



    }

}
