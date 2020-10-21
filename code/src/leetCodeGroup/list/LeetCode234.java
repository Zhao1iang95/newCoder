package leetCodeGroup.list;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 回文链表
 * @create : 2020/07/31 10:02
 */
public class LeetCode234 {
    //请判断一个链表是否为回文链表。
    public boolean isPalindrome(ListNode head){
        if(head==null || head.next==null)return false;
        ListNode slow = head,fast = head.next;
        while(fast!=null && fast.next!=null){
            slow =slow.next;
            fast = fast.next.next;
        }
        if(fast!=null){
            slow = slow.next;
        }
        cut(head,slow);
        return isEq(head,reverse(slow));
    }

    private boolean isEq(ListNode head, ListNode newHead) {
        while (head!=null && newHead!=null){
            if (head.val!=newHead.val)return false;
            head = head.next;
            newHead = newHead.next;
        }
        return true;
    }

    private void cut(ListNode head, ListNode slow) {
        while (head.next!=slow){
            head = head.next;
        }
        head.next =null;
    }
    private ListNode reverse(ListNode head){
        ListNode newNode = null;
        while (head!=null){
            ListNode nextNode = head.next;
            head.next  = newNode;
            newNode = head;
            head = nextNode;
        }
        return newNode;
    }
}
