package BitManipulation;

import java.util.ArrayList;
import java.util.List;

public class LC89_GrayCode {

        static List<Integer> grayCode(int n) {

            List<Integer> result = new ArrayList<>();
            int total = 1 << n;   // 2^n

            for(int i = 0; i < total; i++){
                result.add(i ^ (i >> 1));
            }

            return result;
        }
    void main(){
        System.out.println(grayCode(2));
        System.out.println(grayCode(1));
    }
}
