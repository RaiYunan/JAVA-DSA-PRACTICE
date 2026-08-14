package ArrayPrograms;
import java.util.ArrayList;
import java.util.List;

public class LC1431_KidsWithTheGreatestNumberOfCandies {

    /*
     * check if each kid can have the most candies after receiving extra
     * 1. find current max candies among all kids
     * 2. for each kid, check if candy + extraCandies >= max
     *
     * greedy / linear scan
     * O(n) time, O(n) space
     */
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int candy : candies) max = Math.max(max, candy);
        List<Boolean> ans = new ArrayList<>();
        for (int candy : candies) ans.add(candy + extraCandies >= max);
        return ans;
    }

    void main() {
        System.out.println(kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3)); // [true, true, true, false, true]
        System.out.println(kidsWithCandies(new int[]{4, 2, 1, 1, 2}, 1)); // [true, false, false, false, false]
        System.out.println(kidsWithCandies(new int[]{12, 1, 12}, 10));    // [true, false, true]
    }
}
