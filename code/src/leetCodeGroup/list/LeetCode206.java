package leetCodeGroup.list;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 链表反转
 * @create : 2020/07/30 10:16
 */
public class LeetCode206 {
    //递归
    public ListNode reverseList(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode next = head.next;
        ListNode newNode = reverseList(next);
        next.next = head;
        head.next =null;
        return newNode;
    }
    //头插法
    public ListNode reverseList1(ListNode head){
        ListNode newNode  =new ListNode(-1);
        while (head!=null){
            ListNode next  =head.next;
            head.next = newNode.next;
            newNode.next = head;
            head = next;
        }
        return newNode.next;
    }
}
