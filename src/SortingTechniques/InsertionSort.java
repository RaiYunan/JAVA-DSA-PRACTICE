package SortingTechniques;

import java.util.Arrays;

public class InsertionSort {

        public int[] insertionSort(int[] nums) {

            for (int i = 1; i < nums.length; i++) {

                int key = nums[i];     // element to insert
                int j = i - 1;

                // shift elements greater than key
                while (j >= 0 && nums[j] > key) {
                    nums[j + 1] = nums[j];
                    j--;
                }

                // place key at correct position
                nums[j + 1] = key;
            }

            return nums;
        }

        void main(){
            int[] arr = {5, 1, 4, 2};

            System.out.println(Arrays.toString(insertionSort(arr)));
        }
}
