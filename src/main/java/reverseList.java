import java.util.List;

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
            ListNode next = cur.next; //2, 3, 4, 5, null

            /** 这两个是调换相邻两个数的位置 **/
            cur.next = new_head; //null, 1, 2, 3, 4
            new_head = cur;//1, 2, 3, 4, 5

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
