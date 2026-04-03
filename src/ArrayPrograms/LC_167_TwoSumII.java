package ArrayPrograms;

import java.util.Arrays;

public class LC_167_TwoSumII {
    static int[] twoSumBruteForce(int[] numbers,int target){
        int n = numbers.length;

        for (int i = 0; i < n - 1; i++) {
            int a = numbers[i];
            if (a + numbers[i + 1] > target) break;

            for (int j = i + 1; j < n; j++) {
                int sum = a + numbers[j];

                if (sum == target) {
                    return new int[]{i + 1, j + 1};
                }

                if (sum > target) break;
            }
        }

        return new int[]{-1, -1};
    }

    static int[] twoSumOptimal(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1};
            }
            else if (sum < target) {
                left++;
            }
            else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }
    void main(){
    int[] nums={2,7,11,15};
    int target=17;
    System.out.println(Arrays.toString(twoSumBruteForce(nums,target)));
        System.out.println(Arrays.toString(twoSumOptimal(nums,target)));
    }
}
