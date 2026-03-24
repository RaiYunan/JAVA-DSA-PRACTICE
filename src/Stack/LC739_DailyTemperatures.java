package Stack;

import java.util.Arrays;

public class LC739_DailyTemperatures {
    static int[] dailyTemperaturesBruteForce(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (temperatures[j] > temperatures[i]) {
                    result[i] = j - i;
                    break;
                }
            }
        }
        return result;
    }
    void main(){
        int[] temperatures={73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemperaturesBruteForce(temperatures)));
    }
}
