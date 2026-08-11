package LinkedList;

public class LC1290_ConvertBinaryNumberInLinkedListToInteger {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    /*
     * convert binary number represented as linked list to decimal
     * 1. shift result left by 1 (multiply by 2)
     * 2. OR with current node value to append the bit
     * 3. repeat until end of list
     *
     * bit manipulation: left shift + OR
     * O(n) time, O(1) space
     */
    static int getDecimalValue(ListNode head) {
        int result = 0;
        while (head != null) {
            result = (result << 1) | head.val;
            head = head.next;
        }
        return result;
    }

    static ListNode build(int[] nums) {
        ListNode dummy = new ListNode(0), curr = dummy;
        for (int n : nums) { curr.next = new ListNode(n); curr = curr.next; }
        return dummy.next;
    }

    void main() {
        System.out.println(getDecimalValue(build(new int[]{1, 0, 1})));      // 5
        System.out.println(getDecimalValue(build(new int[]{0})));            // 0
        System.out.println(getDecimalValue(build(new int[]{1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0}))); // 18880
    }
}
