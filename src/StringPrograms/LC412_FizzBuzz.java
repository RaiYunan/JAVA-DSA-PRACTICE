package StringPrograms;

import java.util.ArrayList;
import java.util.List;

public class LC412_FizzBuzz {

    static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if      (i % 15 == 0) result.add("FizzBuzz");
            else if (i % 3  == 0) result.add("Fizz");
            else if (i % 5  == 0) result.add("Buzz");
            else                  result.add(String.valueOf(i));
        }
        return result;
    }

    void main() {
        System.out.println(fizzBuzz(15));
        // [1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz]
    }
}