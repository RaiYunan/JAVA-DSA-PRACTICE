package LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LC148_SortList {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    static ListNode sortList(ListNode head) {

        List<Integer> list = new ArrayList<>();

        ListNode temp = head;


        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }


        Collections.sort(list);

        temp = head;

        int index = 0;

        while (temp != null) {
            temp.val = list.get(index++);
            temp = temp.next;
        }

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
        System.out.println(print(sortList(build(new int[]{4, 2, 1, 3})))); // 1 -> 2 -> 3 -> 4
        System.out.println(print(sortList(build(new int[]{-1, 5, 3, 4, 0})))); // -1 -> 0 -> 3 -> 4 -> 5
    }
}