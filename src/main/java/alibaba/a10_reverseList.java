package alibaba;
/**
 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 输入：head = [1,2,3,4,5]
 输出：[5,4,3,2,1]
 * **/
public class a10_reverseList {
    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){

            // 保存要反转到头的那个节点
            ListNode next = curr.next; //2, 3, 4, 5, null

            // 要反转的那个节点指向已经反转的上⼀个节点(备注:第⼀次反转的时候会指向null)
            curr.next = prev; //null, 1, 2, 3, 4

            // 上⼀个已经反转到头部的节点
            prev = curr;//1, 2, 3, 4, 5

            // ⼀直向链表尾⾛
            curr = next;//2, 3, 4, 5, null
        }
        return prev;
    }
}
