package BitManipulation;

import java.util.Set;

public class LC762_PrimeNumberOfSetBitsInBinaryRepresentation {

    /*
     * given range [left, right], count numbers whose set bit count is prime
     * 1. count set bits of each number using Integer.bitCount()
     * 2. check if that count is a prime (max 32 bits, so primes up to 19 only)
     * 3. increment counter if prime
     *
     * brute force: iterate range, check set bits against prime set
     * O(n) time, O(1) space
     */
    static int countPrimeSetBits(int left, int right) {
        Set<Integer> primes = Set.of(2, 3, 5, 7, 11, 13, 17, 19);
        int count = 0;
        for (int num = left; num <= right; num++)
            if (primes.contains(Integer.bitCount(num))) count++;
        return count;
    }

    void main() {
        System.out.println(countPrimeSetBits(6, 10));   // ans:4
        System.out.println(countPrimeSetBits(10, 15));  // ans:5
    }
}
