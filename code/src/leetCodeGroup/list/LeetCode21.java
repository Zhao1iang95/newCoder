package leetCodeGroup.list;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 归并两个有序链表
 * @create : 2020/07/30 10:56
 */
public class LeetCode21 {
    public ListNode mergeTowLists(ListNode head1,ListNode head2){
        if(head1 == null)return head2;
        if(head2==null) return head1;
        if(head1.val<head2.val){
            head1.next = mergeTowLists(head1.next,head2);
            return head1;
        }else {
            head2.next = mergeTowLists(head1,head2.next);
            return head2;
        }
    }
}
