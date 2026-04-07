package LinkedList;

public class LC878_MIddleOfTheLInkedList {
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
        int count=0;
        ListNode current=head;
        while(current!=null){
            count++;
            current=current.next;
        }
        int length=(int) Math.ceil((count+1)/2.0);

        current=head;
        ListNode midNode=null;
        count=0;
        while(current!=null){
            count++;
            if(count==length){
                midNode=current;
            }
            current=current.next;
        }
        return midNode;
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
