package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class LC141_DetectLinkedListCycle {
    static class ListNode {
        ListNode next;
        int val;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.printf("%d -> ", curr.val);
            curr = curr.next;
        }
        System.out.println("null");

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

    static boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }

        }
        return false;
    }

    void main() {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        printList(list1);

        System.out.println(hasCycle(list1));
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        node5.next = node3;
        printCyclicList(node1);
        System.out.println(hasCycle(node1));

    }
}
