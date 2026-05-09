package LinkedList;

public class LC61_RotateList {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        int length = 1;
        ListNode tail = head;
        while (tail.next != null) { tail = tail.next; length++; }

        k = k % length;
        if (k == 0) return head;

        tail.next = head;

        ListNode newTail = head;
        for (int i = 1; i < length - k; i++) newTail = newTail.next;

        ListNode newHead = newTail.next;
        newTail.next = null;
        return newHead;
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
        System.out.println(print(rotateRight(build(new int[]{1, 2, 3, 4, 5}), 2)));
        System.out.println(print(rotateRight(build(new int[]{0, 1, 2}), 4)));
    }
}