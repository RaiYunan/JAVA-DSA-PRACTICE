package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class LC142_DetectLinkedListCycleII {
    static class ListNode{
        int val;
        ListNode next;

        ListNode(int x){
            this.val=x;
        }
        ListNode(int x,ListNode head){
            this.val=x;
            this.next=head;
        }
    }
    static void printList(ListNode head){
        ListNode curr=head;
        while(curr!=null){
            System.out.printf("%d -> ",curr.val);
            curr=curr.next;
        }
        System.out.println("null\n");
    }

    static ListNode detectCycle(ListNode head) {
        if(head==null) return null;

        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                slow=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return fast;
            }
        }
        return null;
    }

    static void printCyclicList(ListNode head) {
        Set<ListNode> visited = new HashSet<>();
        ListNode curr = head;

        while (curr != null) {
            if (visited.contains(curr)) {
                System.out.print("(" + curr.val + ") -> ... (cycle detected)\n");
                break;
            }
            System.out.print(curr.val + " -> ");
            visited.add(curr);
            curr = curr.next;
        }

        if (curr == null) {
            System.out.println("null");
        }
    }
    void main(){
        ListNode list1=new ListNode(1,new ListNode(2,new ListNode(3)));
        printList(list1);
        System.out.println(detectCycle(list1));

        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        node5.next = node3;
        printCyclicList(node1);

        printCyclicList(detectCycle(node1));
    }
}
