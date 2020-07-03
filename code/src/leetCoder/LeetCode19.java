package leetCoder;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 删除链表的倒数第N个节点
 * @create : 2020/06/09 09:01
 */
public class LeetCode19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = new ListNode(0);
        pre.next=head;
        ListNode start=pre,end = pre;
        while (n!=0){
            start=start.next;
            n--;
        }
        while (start.next!=null){
            start=start.next;
            end = end.next;
        }
        end.next = end.next.next;
        return pre.next;
    }
}
