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

    /*
     * swap every two adjacent nodes by relinking pointers (optimal)
     * 1. dummy node before head to simplify edge cases
     * 2. for each pair: relink prev → second → first → rest
     * 3. advance prev by 2 nodes
     *
     * pointer relinking
     * O(n) time, O(1) space
     */
    static ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        while (prev.next != null && prev.next.next != null) {
            ListNode first  = prev.next;
            ListNode second = prev.next.next;
            first.next  = second.next;
            second.next = first;
            prev.next   = second;
            prev = first;
        }
        return dummy.next;
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

        System.out.println(print(swapPairs(build(new int[]{1, 2, 3, 4})))); // 2 -> 1 -> 4 -> 3
        System.out.println(print(swapPairs(build(new int[]{1}))));           // 1
    }
}