package Stack;
import java.util.Stack;

public class LC456_132Pattern {

    // monotonic stack  O(n) time | O(n) space
    static boolean find132pattern(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int third = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < third) return true;
            while (!stack.isEmpty() && nums[i] > stack.peek()) third = stack.pop();
            stack.push(nums[i]);
        }
        return false;
    }

    void main() {
        System.out.println(find132pattern(new int[]{1, 2, 3, 4}));    // false
        System.out.println(find132pattern(new int[]{3, 1, 4, 2}));    // true
        System.out.println(find132pattern(new int[]{-1, 3, 2, 0}));   // true
    }
}