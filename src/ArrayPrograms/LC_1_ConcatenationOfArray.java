package ArrayPrograms;

import java.util.Arrays;

public class LC_1_ConcatenationOfArray {
    static int[] getConcatenation(int[] nums) {
        int og=nums.length;
        int n=og*2;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            if(i<og){
                arr[i]=nums[i];
            }else{
                arr[i]=nums[i-og];
            }

        }
        return arr;
    }
    void main(){
        int[] nums={1,2,3};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
}
