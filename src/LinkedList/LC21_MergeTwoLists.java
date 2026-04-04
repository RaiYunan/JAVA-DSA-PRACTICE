package LinkedList;

public class LC21_MergeTwoLists {

    static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }

        if (list1 != null) {
            temp.next = list1;
        } else {
            temp.next = list2;
        }

        return dummy.next;
    }

    static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        ListNode list1 = new ListNode(1,
                new ListNode(3,
                        new ListNode(5)));

        ListNode list2 = new ListNode(2,
                new ListNode(4,
                        new ListNode(6)));

        System.out.print("List1: ");
        printList(list1);

        System.out.print("List2: ");
        printList(list2);

        ListNode merged = mergeTwoLists(list1, list2);

        System.out.print("Merged: ");
        printList(merged);
    }
}