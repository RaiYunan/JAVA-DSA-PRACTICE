package SortingTechniques;

import java.util.Arrays;

public class ShellSort {
    static int[] shellSort(int nums[]){
        int n=nums.length,temp;


        for(int gap=n/2;gap>=1;gap=gap/2){
            for(int j=gap;j<n;j++){
                for(int i=j-gap;i>=0;i=i-gap){
                    if(nums[i+gap]>nums[i]){
                        break;
                    }else{
                        temp=nums[i+gap];
                        nums[i+gap]=nums[i];
                        nums[i]=temp;
                    }
                }
            }
        }
        return nums;
    }
    void main(){
        int[] arr = {5, 1, 4, 2};

        System.out.println(Arrays.toString(shellSort(arr)));



    }
}
