package ArrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class FindEvenDigits {
    static int[] findNumbers(int[] nums) {
        int count;
        ArrayList<Integer> list=new ArrayList<>();

        int j=0;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            int ogNum=nums[i];

            while (nums[i] > 0) {
                count++;
                nums[i] = nums[i]/ 10;
            }
            if (count % 2 == 0) {
                list.add(ogNum);
                j++;

            }
        }
        int[] ans=new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
    public static void main(String[] args){
        int[] nums={12,345,2,6,7896};
        System.out.println(Arrays.toString(findNumbers(nums)));

    }
}
