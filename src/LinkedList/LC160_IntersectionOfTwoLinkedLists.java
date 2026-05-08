package LinkedList;

public class LC160_IntersectionOfTwoLinkedLists {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA, b = headB;
        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }
        return a;
    }

    void main() {
        //      :  A: 4 → 1 ↘
        //                    8 → 4 → 5
        //         B: 5 → 6 ↗
        ListNode shared = new ListNode(8);
        shared.next = new ListNode(4);
        shared.next.next = new ListNode(5);

        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = shared;

        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = shared;

        ListNode result = getIntersectionNode(headA, headB);
        System.out.println("Intersection: " + (result != null ? result.val : "none"));
    }
}