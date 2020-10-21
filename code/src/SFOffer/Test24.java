package SFOffer;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 反转链表
 * @create : 2020/09/25 09:38
 */
public class Test24 {
    //输入一个链表，反转链表后，输出新链表的表头。
    public ListNode ReverseList1(ListNode head){
        //递归
    if (head ==null || head.next==null)return head;
        ListNode next = head.next;
        head.next = null;
        ListNode newHead = ReverseList1(next);
        next.next = head;
        return newHead;
    }
    //头插法
    public ListNode ReverseList2(ListNode head){
        ListNode newList = new ListNode(-1);
        while(head!=null){
            ListNode next = head.next;
            head.next = newList.next;
            newList.next = head;
            head = next;
        }
        return newList.next;
    }
}
