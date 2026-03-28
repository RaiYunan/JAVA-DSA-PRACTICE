package SortingTechniques;

import java.util.Arrays;

public class SelectionSort {
    static int[] selectionSort(int[] nums){
        int n = nums.length;

        for(int i = 0; i < n-1; i++) {
            int min = i;
            for(int j = i+1; j < n; j++) {
                if(nums[j] < nums[min]) {
                    min = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }
        return nums;
    }
    void main(){
        int[] arr = {5, 1, 4, 2};

        System.out.println(Arrays.toString(selectionSort(arr)));



    }
}
