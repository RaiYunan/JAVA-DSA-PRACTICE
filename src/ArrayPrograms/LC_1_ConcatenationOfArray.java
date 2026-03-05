package ArrayPrograms;

import java.util.Arrays;

public class LC_1_ConcatenationOfArray {
    static int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] ans=new int[2*n];

        for(int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        return ans;
    }
    void main(){
        int[] nums={1,2,3};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
}
