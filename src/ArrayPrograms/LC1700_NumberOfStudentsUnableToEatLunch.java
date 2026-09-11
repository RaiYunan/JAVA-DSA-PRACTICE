package ArrayPrograms;

public class LC1700_NumberOfStudentsUnableToEatLunch {

    // 0(n) time | O(1) space
    static int countStudents(int[] students, int[] sandwiches) {
        int[] count = new int[2];
        for (int student : students) count[student]++;
        for (int sandwich : sandwiches) {
            if (count[sandwich] == 0) return count[0] + count[1];
            count[sandwich]--;
        }
        return 0;
    }

    void main() {
        System.out.println(countStudents(new int[]{1,1,0,0}, new int[]{0,1,0,1})); // 0
        System.out.println(countStudents(new int[]{1,1,1,0,0,1}, new int[]{1,0,0,0,1,1})); // 3
    }
}
