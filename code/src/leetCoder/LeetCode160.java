package leetCoder;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 相交链表
 * @create : 2020/07/06 09:56
 */
public class LeetCode160 {
    //找到两个单链表相交的起始节点
    public ListNode getIntersectionNode(ListNode headA,ListNode headB){
        if (headA==null || headB ==null){
            return null;
        }
        ListNode pA =headA,pB = headB;
        while (pA!=pB){
        pA = pA ==null ? headB : pA.next;
        pB = pB == null ? headA : pB.next;
        }
        return pA;
    }
}
