package Math;

public class LC2485_FindThePivotInteger {

    // O(1) time | O(1) space
    static int pivotInteger(int n) {
        int sum = n * (n + 1) / 2;
        int x = (int) Math.sqrt(sum);
        return x * x == sum ? x : -1;
    }

    void main() {
        System.out.println(pivotInteger(8)); // 6
        System.out.println(pivotInteger(1)); // 1
        System.out.println(pivotInteger(4)); // -1
    }
}