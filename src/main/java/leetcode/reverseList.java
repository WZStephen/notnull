package leetcode;

import java.util.List;

public class  reverseList {
    //  * Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseList(ListNode root){
        ListNode old_head_node = null;
        ListNode head = root;
        while(head != null){
            /** b  b->a c->b->a d->c->b->a*/
            ListNode next_node = head.next; // b | c | d

            head.next = old_head_node; // null, a, b
            old_head_node = head;//a, b, c

            head = next_node;//b, c, d
        }
        return old_head_node;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        reverseList ans = new reverseList();

        ListNode res = ans.reverseList(head);
        System.out.println();

    }
}
