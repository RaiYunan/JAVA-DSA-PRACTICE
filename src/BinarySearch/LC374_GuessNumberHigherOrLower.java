package BinarySearch;

public class LC374_GuessNumberHigherOrLower {

    // simulating GuessGame base class
    static int picked = 6;
    static int guess(int num) {
        if (num == picked) return  0;
        if (num >  picked) return -1;
        return 1;
    }

    // binary search - eliminate half search space per guess | O(log n) time | O(1) space
    static int guessNumber(int n) {
        int left = 1, right = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int result = guess(mid);
            if      (result == 0) return mid;
            else if (result <  0) right = mid - 1;
            else                  left  = mid + 1;
        }
        return -1;
    }

    void main() {
        picked = 6;
        System.out.println(guessNumber(10)); // 6

        picked = 1;
        System.out.println(guessNumber(1));  // 1

        picked = 1;
        System.out.println(guessNumber(2));  // 1
    }
}
