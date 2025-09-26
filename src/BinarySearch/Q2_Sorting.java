package BinarySearch;

import java.util.Arrays;

public class Q2_Sorting {
    public static void main(String[] args){
        int[] arr={23,45,5,32,2,0};
        System.out.println("Before Sorting: "+Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("After Sorting: "+Arrays.toString(arr));

    }
}
