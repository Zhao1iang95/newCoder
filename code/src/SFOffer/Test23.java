package SFOffer;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 链表中环的入口
 * @create : 2020/09/25 09:17
 */
public class Test23 {
    //给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
    public ListNode EntryNodeOfLoop(ListNode pHead){
        if (pHead==null || pHead.next==null)return null;
        ListNode fast = pHead,slow = pHead;

        while (fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow)
                break;
        }
        fast = pHead;
        while (fast!=slow){
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}
