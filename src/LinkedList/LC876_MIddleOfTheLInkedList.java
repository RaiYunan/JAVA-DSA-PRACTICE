package LinkedList;

public class LC876_MIddleOfTheLInkedList {
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode current = head;

        // First pass: count nodes
        while (current != null) {
            count++;
            current = current.next;
        }

        System.out.printf("Length of Node : %d\n",count);
        int middle = (count / 2) + 1;
        System.out.printf("Middle Node is %d\n",middle);

        // Second pass: reach middle node
        current = head;
        for (int i = 1; i < middle; i++) {
            current = current.next;
        }

        return current;
    }

    static void printList(ListNode head){
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    void main(){
        ListNode list1 = new ListNode(1,new ListNode(3, new ListNode(5,new ListNode(9))));
        printList(list1);
        printList(middleNode(list1));
    }
}
