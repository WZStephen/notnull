package leetcode;

public class star_getKthFromEnd {

    //Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode former = head, latter = head;
        for(int i = 0; i < k; i++)
            former = former.next;
        while(former != null){
            former = former.next;
            latter = latter.next;
        }
        return latter;
    }
    public static void main(String[] args) {
        ListNode input = new ListNode(1);
        input.next = new ListNode(2);
        input.next.next = new ListNode(3);
        input.next.next.next = new ListNode(4);
        input.next.next.next.next = new ListNode(5);
        star_getKthFromEnd obj = new star_getKthFromEnd();
        obj.getKthFromEnd(input, 2);
    }
}
