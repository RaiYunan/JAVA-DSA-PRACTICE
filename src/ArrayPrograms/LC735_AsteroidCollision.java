package ArrayPrograms;
import java.util.Arrays;

public class LC735_AsteroidCollision {

    // 0(n) time | O(n) space
    static int[] asteroidCollision(int[] asteroids) {
        int[] stack = new int[asteroids.length];
        int top = 0;
        for (int asteroid : asteroids) {
            boolean alive = true;
            while (alive && top > 0 && stack[top - 1] > 0 && asteroid < 0) {
                if (stack[top - 1] < -asteroid)       top--;
                else if (stack[top - 1] == -asteroid) { top--; alive = false; }
                else                                  alive = false;
            }
            if (alive) stack[top++] = asteroid;
        }
        return Arrays.copyOf(stack, top);
    }

    void main() {
        System.out.println(Arrays.toString(asteroidCollision(new int[]{5, 10, -5})));  // [5, 10]
        System.out.println(Arrays.toString(asteroidCollision(new int[]{8, -8})));      // []
        System.out.println(Arrays.toString(asteroidCollision(new int[]{10, 2, -5})));  // [10]
        System.out.println(Arrays.toString(asteroidCollision(new int[]{-2, -1, 1, 2}))); // [-2, -1, 1, 2]
    }
}
