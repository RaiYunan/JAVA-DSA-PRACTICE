package ArrayPrograms;

public class LC2739_TotalDistanceTraveled {

    // O(n) time | O(1) space
    static int hardestWorker(int n, int[][] logs) {
        int prev = 0, maxDuration = 0, answer = n;
        for (int[] log : logs) {
            int id = log[0], duration = log[1] - prev;
            if (duration > maxDuration || (duration == maxDuration && id < answer)) {
                maxDuration = duration;
                answer = id;
            }
            prev = log[1];
        }
        return answer;
    }

    void main() {
        System.out.println(hardestWorker(10, new int[][]{{0,3},{2,5},{3,10}}));       // 0
        System.out.println(hardestWorker(6,  new int[][]{{0,10},{1,20}}));             // 0
        System.out.println(hardestWorker(10, new int[][]{{1,1},{3,7},{2,12},{7,17}})); // 3
    }
}
