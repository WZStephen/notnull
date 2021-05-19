/**
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 *
 * 我们把第 (L - n)个结点的 next 指针重新链接⾄第 (L - n + 2)个结点，完成这个算法。
 */
public class removeNthFromEnd {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {this.val = val; this.next = next;}
    }
    public ListNode removeNthFromEnd(ListNode head, int n){
        // 哑结点，哑结点⽤来简化某些极端情况，例如列表中只含有⼀个结点，或需要删除列表的头部
        ListNode dummy = new ListNode(0);

        // 哑结点指向头结点
        dummy.next = head;

        // 保存链表⻓度
        int length = 0;
        ListNode len = head;
        while(len != null){
            length++;
            len = len.next;
        }

        // 找到 L-n 位置的节点
        length -= n;
        ListNode target = dummy;
        while(length > 0){
            target = target.next;
            length--;
        }

        target.next = target.next.next;
        return dummy.next;
    }
    public static void main(String[] args) {
        removeNthFromEnd obj = new removeNthFromEnd();
        System.out.println(obj.removeNthFromEnd(new ListNode(1, new ListNode(2, new ListNode(3))), 2).toString());
    }
}
