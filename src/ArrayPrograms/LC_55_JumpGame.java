package ArrayPrograms;

public class LC_55_JumpGame {

    static boolean canJump(int[] nums) {

        int maxReach = 0;

        for (int i = 0; i < nums.length; i++) {


            if (i > maxReach)
                return false;


            maxReach = Math.max(maxReach, i + nums[i]);
        }

        return true;
    }

    void main() {
        int[] arr1 = {2,3,1,1,4};
        int[] arr2={3,2,1,0,4};
        System.out.println(canJump(arr1));;
        System.out.println(canJump(arr2));

    }
}
