package LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LC147_InsertionSortList {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    /*
     * sort linked list using brute force
     * 1. collect all values into arraylist
     * 2. sort the list
     * 3. write sorted values back into nodes
     *
     * collect + sort + rewrite
     * O(n log n) time, O(n) space
     */
    static ListNode insertionSortList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        for (ListNode cur = head; cur != null; cur = cur.next) list.add(cur.val);
        Collections.sort(list);
        ListNode cur = head;
        for (int x : list) { cur.val = x; cur = cur.next; }
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
        System.out.println(print(insertionSortList(build(new int[]{4, 2, 1, 3})))); // 1 -> 2 -> 3 -> 4
        System.out.println(print(insertionSortList(build(new int[]{-1, 5, 3, 4, 0})))); // -1 -> 0 -> 3 -> 4 -> 5
    }
}