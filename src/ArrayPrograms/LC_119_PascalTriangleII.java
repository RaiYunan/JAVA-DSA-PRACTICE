package ArrayPrograms;
import java.util.*;

public class LC_119_PascalTriangleII {


        static List<Integer> getRow(int rowIndex) {

            List<List<Integer>> triangle = new ArrayList<>();

            for (int i = 0; i <= rowIndex; i++) {
                List<Integer> row = new ArrayList<>();


                for (int j = 0; j <= i; j++) {

                    if (j == 0 || j == i) {
                        row.add(1);
                    } else {

                        int value = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                        row.add(value);
                    }
                }

                triangle.add(row);
            }


            return triangle.get(rowIndex);
        }
        public static void main(String[] args){
            int rowIndex=3;
            System.out.println(getRow(rowIndex));
        }

}
