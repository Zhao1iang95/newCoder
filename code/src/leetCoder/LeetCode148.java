package leetCoder;

import java.util.List;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 排序链表
 * @create : 2020/07/02 09:47
 */
public class LeetCode148 {
    //在 O(n log n) 时间复杂度和常数级空间复杂度下，对链表进行排序。
    public ListNode sortList(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode fast = head.next,slow = head;
        while (fast !=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp = slow.next;
        slow.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(temp);
        ListNode h = new ListNode(0);
        ListNode res = h;
        while (left!=null && right!=null){
            if (left.val < right.val){
                h.next = left;
                left = left.next;
            }else {
                h.next = right;
                right = right.next;
            }
            h = h.next;
        }
        h.next = left !=null ? left :right;
        return res.next;
    }
}
