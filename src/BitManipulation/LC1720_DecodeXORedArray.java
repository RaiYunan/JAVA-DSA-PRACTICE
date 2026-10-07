package BitManipulation;

public class LC1720_DecodeXORedArray {

    // O(n) time | O(n) space
    static int[] decode(int[] encoded, int first) {
        int[] arr = new int[encoded.length + 1];
        arr[0] = first;
        for (int i = 0; i < encoded.length; i++) arr[i + 1] = arr[i] ^ encoded[i];
        return arr;
    }

    void main() {
        System.out.println(java.util.Arrays.toString(decode(new int[]{1, 2, 3}, 1)));    // [1, 0, 2, 1]
        System.out.println(java.util.Arrays.toString(decode(new int[]{6, 2, 7, 3}, 4))); // [4, 2, 0, 7, 4]
    }
}
