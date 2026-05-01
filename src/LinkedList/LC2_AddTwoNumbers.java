package LinkedList;

public class LC2_AddTwoNumbers {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
        }
    }

    static ListNode addTwoNumbers(ListNode l1,ListNode l2){
        ListNode dummy=new ListNode(-1);
        ListNode current=dummy;
        int carry=0;

        while(l1!=null || l2!=null || carry>0){
            int sum=carry;

            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }

            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }

            carry=sum/10;

            int digit=sum%10;
            current.next=new ListNode(digit);
            current=current.next;
        }
        return dummy.next;
    }

    static ListNode build(int[] num){
        ListNode dummy=new ListNode(0);
        ListNode current=dummy;
        for(int n:num){
            current.next=new ListNode(n);
            current=current.next;
        }
        return dummy.next;
    }

    static String printList(ListNode node){
        StringBuilder sb = new StringBuilder();
        while (node != null) {
            sb.append(node.val).append(node.next != null ? " -> " : "");
            node = node.next;
        }
        return sb.toString();
    }
    void main(){
        ListNode l1 = build(new int[]{2, 4, 3});
        ListNode l2 = build(new int[]{5, 6, 4});

        System.out.println("Input  l1 : " + printList(l1));
        System.out.println("Input  l2 : " + printList(l2));
        System.out.println("Output    : " + printList(addTwoNumbers(l1, l2)));
    }
}
