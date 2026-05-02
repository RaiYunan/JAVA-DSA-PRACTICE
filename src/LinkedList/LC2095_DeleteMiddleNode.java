package LinkedList;

public class LC2095_DeleteMiddleNode {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    static ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode slow = head, fast = head, prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = slow.next;
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

        ListNode l1 = build(new int[]{1, 3, 4, 7, 1, 2, 6});
        System.out.println("Input  : " + print(l1));
        System.out.println("Output : " + print(deleteMiddle(l1)));


        ListNode l2 = build(new int[]{1, 2, 3, 4});
        System.out.println("Input  : " + print(l2));
        System.out.println("Output : " + print(deleteMiddle(l2)));
    }
}