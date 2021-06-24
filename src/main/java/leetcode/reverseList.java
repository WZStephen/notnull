package leetcode;

public class reverseList {
    //  * Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseList(ListNode head){
        ListNode new_head = null;
        ListNode cur = head;
        while(cur != null){

            // 保存要反转到头的那个节点
            ListNode next = cur.next; //2, 3, 4, 5, null

            // 要反转的那个节点指向已经反转的上⼀个节点(备注:第⼀次反转的时候会指向null)
            cur.next = new_head; //null, 1, 2, 3, 4

            // 上⼀个已经反转到头部的节点
            new_head = cur;//1, 2, 3, 4, 5

            // ⼀直向链表尾⾛
            cur = next;//2, 3, 4, 5, null
        }
        return new_head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        reverseList ans = new reverseList();

        ListNode res = ans.reverseList(head);

    }
}
