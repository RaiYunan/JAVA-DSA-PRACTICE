package LinkedList;

public class LC83_RemoveDuplicatesFromSortedList {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    /*
     * given a sorted linked list, remove duplicates in-place
     * 1. traverse list with curr pointer
     * 2. if curr.val == curr.next.val, skip next node
     * 3. otherwise advance curr
     *
     * single pass: compare adjacent nodes, skip duplicates
     * O(n) time, O(1) space
     */
    static ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) curr.next = curr.next.next;
            else                           curr = curr.next;
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
        System.out.println(print(deleteDuplicates(build(new int[]{1, 1, 2}))));          // 1 -> 2
        System.out.println(print(deleteDuplicates(build(new int[]{1, 1, 2, 3, 3})))); // 1 -> 2 -> 3
    }
}