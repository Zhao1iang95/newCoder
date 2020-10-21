package leetCoder;


/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 反转链表
 * @create : 2020/07/08 07:53
 */
public class LeetCode206 {
    //迭代
    public ListNode reverseList(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode temp = null;
        while (curr!=null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    //递归
    public ListNode reverseList2(ListNode head){
        if (head==null || head.next==null){
            return head;
        }
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}
