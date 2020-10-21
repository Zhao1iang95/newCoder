package leetCodeGroup.list;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 两两交换链表中的节点
 * @create : 2020/07/31 09:04
 */
public class LeetCode24 {
    //给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
    //
    //你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
    public ListNode swapPairs(ListNode head){
        ListNode node = new ListNode(-1);
        node.next = head;
        ListNode pre = node;
        while (pre.next!=null && pre.next.next!=null){
            ListNode l1 =pre.next,l2 = pre.next.next;
            ListNode next= l2.next;
            l1.next  =next;
            l2.next = l1;
            pre.next = l2;
            pre = l1;
        }
        return node.next;
    }
}
