package SFOffer;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 链表中的倒数第K个节点
 * @create : 2020/09/25 09:07
 */
public class Test22 {
    //输入一个链表，输出该链表中倒数第k个结点。
    public ListNode FindKthToTail(ListNode head,int k){
        if (head==null)return null;
        ListNode P1 = head;
        while (P1!=null && k-- >0){
            P1 = P1.next;
        }
        if (k >0)return null;
        ListNode P2 = head;
        while (P1!=null){
            P1 = P1.next;
            P2 = P2.next;
        }
        return P2;
    }
}
