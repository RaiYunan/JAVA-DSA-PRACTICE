package LinkedList;

public class LC82_RemoveDuplicatesFromSortedListII {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    /*
     * given a sorted linked list, remove all nodes with duplicate values
     * 1. dummy node before head to handle edge cases
     * 2. skip all consecutive nodes with same value using inner while
     * 3. if prev.next == curr, no duplicates found → advance prev
     * 4. otherwise link prev.next to curr.next, skipping all duplicates
     *
     * two pointer: prev tracks last confirmed unique, curr scans ahead
     * O(n) time, O(1) space
     */
    static ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy, curr = head;

        while (curr != null) {
            while (curr.next != null && curr.val == curr.next.val) curr = curr.next;
            if (prev.next == curr) prev = prev.next;
            else                   prev.next = curr.next;
            curr = curr.next;
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
        System.out.println(print(deleteDuplicates(build(new int[]{1, 2, 3, 3, 4, 4, 5})))); // 1 -> 2 -> 5
        System.out.println(print(deleteDuplicates(build(new int[]{1, 1, 1, 2, 3})))); // 2 -> 3
        System.out.println(print(deleteDuplicates(build(new int[]{1, 1})))); // (empty)
    }
}