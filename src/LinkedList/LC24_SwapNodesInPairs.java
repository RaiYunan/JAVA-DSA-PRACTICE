package LinkedList;

public class LC24_SwapNodesInPairs {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    /*
     * swap every two adjacent nodes by swapping values (brute force)
     * 1. iterate in steps of 2
     * 2. swap values of current and current.next
     *
     * value swap
     * O(n) time, O(1) space
     */
    static ListNode swapPairsBrute(ListNode head) {
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            int temp    = curr.val;
            curr.val    = curr.next.val;
            curr.next.val = temp;
            curr = curr.next.next;
        }
        return head;
    }

    static ListNode build(int[] nums) {
        ListNode dummy = new ListNode(0), curr = dummy;
        for (int n : nums) { curr.next = new ListNode(n); curr = curr.next; }
        return dummy.next;
    }

    static String print(ListNode node) {
        StringBuilder sb = new StringBuilder();
        while (node != null) { sb.append(node.val).append(node.next != null ? " -> " : ""); node = node.next; }
        return sb.toString();
    }

    void main() {
        System.out.println(print(swapPairsBrute(build(new int[]{1, 2, 3, 4})))); // 2 -> 1 -> 4 -> 3
        System.out.println(print(swapPairsBrute(build(new int[]{1}))));           // 1
    }
}