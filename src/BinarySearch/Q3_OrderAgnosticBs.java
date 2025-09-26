package BinarySearch;

public class Q3_OrderAgnosticBs {
    static int OrderBS(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        boolean isAscending=arr[start]<arr[end];
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAscending){
                if (arr[mid]>target) {
                    end=mid-1;
                } else {
                    start=mid+1;
                }
            }else{
                if (arr[mid]<target) {
                    end=mid-1;
                } else {
                    start=mid+1;
                }

            }

        }
        return -1;



    }
    public static void main(String[] args) {
        int[] arr={0, 2, 5, 29, 32, 45};
        int target=29;

        int result=OrderBS(arr,target);
        System.out.println(result);

    }
}
