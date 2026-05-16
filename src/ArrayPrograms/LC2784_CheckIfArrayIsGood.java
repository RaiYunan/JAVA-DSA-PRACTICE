package ArrayPrograms;

public class LC2784_CheckIfArrayIsGood {

    static boolean isGood(int[] nums) {
        int n = nums.length;
        int max = 0;

        for (int num : nums) max = Math.max(num, max);

        if (max != n - 1) return false;

        for (int i = 1; i <= max; i++) {
            int count = 0;
            for (int num : nums) if (num == i) count++;
            if (i == max ? count != 2 : count != 1) return false;
        }

        return true;
    }

    void main() {
        System.out.println(isGood(new int[]{2, 1, 3, 3}));
        System.out.println(isGood(new int[]{1, 3, 3, 2}));
        System.out.println(isGood(new int[]{1, 1}));
        System.out.println(isGood(new int[]{3, 4, 4, 1, 2}));
    }
}