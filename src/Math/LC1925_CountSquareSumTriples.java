package Math;

public class LC1925_CountSquareSumTriples {

    /*
     * find all valid pythagorean triples
     * 1. try every pair (a, b)
     * 2. calculate a² + b²
     * 3. use sqrt() to get c
     * 4. if c is within range and c² equals the sum, count it
     *
     * better than brute force because we don't loop for c
     *
     * time: O(n²)
     * space: O(1)
     */
    static int countTriples(int n) {
        int count = 0;

        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                int sum = a * a + b * b;
                int c = (int) Math.sqrt(sum);

                if (c <= n && c * c == sum) {
                    count++;
                }
            }
        }

        return count;
    }

    /*
     * brute force approach
     * try every possible (a, b, c)
     * if a² + b² == c², we found a valid triple
     *
     * time: O(n³)
     * space: O(1)
     */
    static int countTriplesBruteForce(int n) {
        int count = 0;

        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                for (int c = 1; c <= n; c++) {
                    if (a * a + b * b == c * c) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
    void main() {
        System.out.println(countTriples(5));             // 2
        System.out.println(countTriples(10));            // 4

        System.out.println(countTriplesBruteForce(5));   // 2
        System.out.println(countTriplesBruteForce(10));  // 4
    }
}