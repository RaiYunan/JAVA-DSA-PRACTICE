package ArrayPrograms;

public class FindMajorityElement {
    static int majorityElement(int[] nums) {
        int count = 0;      // Tracks the frequency balance
        int candidate = 0;  // Stores the potential majority element

        // Step 1: Find the candidate
        for (int num : nums) {
            if (count == 0) {
                candidate = num; // Choose new candidate
            }
            count += (num == candidate) ? 1 : -1; // Increment if same, else decrement
        }

        // Step 2: Candidate is guaranteed to be the majority element
        return candidate;
    }

    public static void main(String[] args){
        int[] arr={2,2,1,1,1,2,2};
        System.out.println(majorityElement((arr)));
    }
}
