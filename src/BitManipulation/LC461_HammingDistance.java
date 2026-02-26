package BitManipulation;

public class LC461_HammingDistance {
    // Most optimal solution
    // Uses Brian Kerrnighan's Algorithm
    static int hammingDistance(int x, int y) {
        int xor = x ^ y;// if bits are not equal => 1 otherwise 0
        int count = 0;
        while (xor != 0) {
            xor = xor & (xor - 1);// removes the lowest set bit
            count++;
        }
        return count;
    }

    void main() {
        int x1 = 4, y1 = 1;
        System.out.println(hammingDistance(x1, y1));
    }
}
