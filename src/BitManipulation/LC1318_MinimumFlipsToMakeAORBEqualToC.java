package BitManipulation;

public class LC1318_MinimumFlipsToMakeAORBEqualToC {

    // check each bit position, count flips needed | O(32) time | O(1) space
    static int minFlips(int a, int b, int c) {
        int flips = 0;
        for (int i = 0; i < 32; i++) {
            int x = (a >> i) & 1;
            int y = (b >> i) & 1;
            int z = (c >> i) & 1;
            if (z == 1) { if (x == 0 && y == 0) flips++; }
            else          flips += x + y;
        }
        return flips;
    }

    void main() {
        System.out.println(minFlips(2, 6, 5)); // 3
        System.out.println(minFlips(4, 2, 7)); // 1
        System.out.println(minFlips(1, 2, 3)); // 0
    }
}