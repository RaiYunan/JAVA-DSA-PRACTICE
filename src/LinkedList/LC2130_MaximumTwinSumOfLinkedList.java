package LinkedList;

public class LC2130_MaximumTwinSumOfLinkedList {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    /*
     * twin sum: node i pairs with node (n-1-i), find max pair sum
     * 1. find middle using slow/fast pointers
     * 2. reverse second half in-place
     * 3. walk both halves simultaneously, track max sum
     *
     * slow-fast pointer + in-place reverse
     * O(n) time, O(1) space
     */
    static int pairSum(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        while (slow != null) {
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        int ans = 0;
        while (prev != null) {
            ans  = Math.max(ans, head.val + prev.val);
            head = head.next;
            prev = prev.next;
        }

        return ans;
    }

    static ListNode build(int[] nums) {
        ListNode dummy = new ListNode(0), curr = dummy;
        for (int n : nums) { curr.next = new ListNode(n); curr = curr.next; }
        return dummy.next;
    }

    void main() {
        System.out.println(pairSum(build(new int[]{5, 4, 2, 1})));          // 6
        System.out.println(pairSum(build(new int[]{4, 2, 2, 3})));          // 7
        System.out.println(pairSum(build(new int[]{1, 100000})));            // 100001
    }
}
