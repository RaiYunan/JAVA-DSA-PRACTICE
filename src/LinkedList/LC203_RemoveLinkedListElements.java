package LinkedList;

public class LC203_RemoveLinkedListElements {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    /*
     * remove all nodes with given val from linked list
     * 1. dummy node before head handles edge case of removing head
     * 2. if next node matches val, skip it
     * 3. otherwise advance current
     *
     * single pass with dummy node
     * O(n) time, O(1) space
     */
    static ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        while (curr.next != null) {
            if (curr.next.val == val) curr.next = curr.next.next;
            else                      curr = curr.next;
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
        System.out.println(print(removeElements(build(new int[]{1, 2, 6, 3, 4, 5, 6}), 6))); // 1 -> 2 -> 3 -> 4 -> 5
        System.out.println(print(removeElements(build(new int[]{7, 7, 7, 7}), 7)));           // (empty)
        System.out.println(print(removeElements(build(new int[]{1, 2, 3}), 4)));              // 1 -> 2 -> 3
    }
}