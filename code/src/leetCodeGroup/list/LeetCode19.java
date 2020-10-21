package leetCodeGroup.list;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 删除链表的倒数第n个节点
 * @create : 2020/07/30 11:08
 */
public class LeetCode19 {
    public ListNode removeNthFromEnd(ListNode head,int n){
        ListNode fast = head;
        while(n-- >0){
            fast = fast.next;
        }
        if(fast == null)return head.next;
        ListNode slow = head;
        while (fast.next!=null){
            fast = fast.next;
            slow  =slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
