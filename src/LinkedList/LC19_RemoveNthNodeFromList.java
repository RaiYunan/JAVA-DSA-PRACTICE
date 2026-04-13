package LinkedList;

public class LC19_RemoveNthNodeFromList {
    static ListNode removeNthFromEnd(ListNode head, int n) {
            // Step 1: find length
            int len = 0;
            ListNode temp = head;

            while (temp != null) {
                len++;
                temp = temp.next;
            }

            // Step 2: handle deleting head
            if (len == n) {
                return head.next;
            }

            // Step 3: go to (len - n - 1)th node
            temp = head;
            for (int i = 1; i < len - n; i++) {
                temp = temp.next;
            }

            // Step 4: delete node
            temp.next = temp.next.next;

            return head;
        }

    static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
        void main(){
            ListNode list1 = new ListNode(1,
                    new ListNode(3,
                            new ListNode(5)));

            ListNode list2 = new ListNode(2,
                    new ListNode(4,
                            new ListNode(6)));

            printList(list1);
            printList(list2);

            printList(removeNthFromEnd(list1,3));
            printList(removeNthFromEnd(list2,1));

        }
}
