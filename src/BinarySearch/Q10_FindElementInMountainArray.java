package BinarySearch;

public class Q10_FindElementInMountainArray {
    static int SearchElement(int[] arr, int target){
        int peak=SearchPeak(arr);

        int firstTry=BinarySearch(arr,target,0,peak,true);
        if(firstTry!=-1) return firstTry;

        return BinarySearch(arr,target,peak,arr.length-1,false);
    }
    static int SearchPeak(int[] arr){
        int start=0;
        int end=arr.length;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else{
                start=mid+1;
            }
            }
        return end;
    }

    static int BinarySearch(int[] arr,int target,int start,int end,boolean isAscending) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAscending){
                if(target>arr[mid]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }else{
                if(target<arr[mid]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={2,3,4,5,6,5,4,2,3,1};
        int target=1;
        System.out.print(SearchElement(arr,target));

    }
}
