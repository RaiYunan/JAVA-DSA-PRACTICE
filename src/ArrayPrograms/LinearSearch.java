package ArrayPrograms;

import java.util.Scanner;

public class LinearSearch {

    static int search(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {18, 12, 9, 4, 77, 50, 69};

        Scanner in = new Scanner(System.in);
        System.out.print("Enter element to search: ");
        int target = in.nextInt();

        int index = search(arr, target);

        if (index == -1) {
            System.out.printf("%d does not exist in the array.%n", target);
        } else {
            System.out.printf(
                    "%d exists at position %d in the array.%n",
                    target,
                    index + 1
            );
        }

        in.close();
    }
}
