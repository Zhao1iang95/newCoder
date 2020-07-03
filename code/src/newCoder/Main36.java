/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 两个链表的第一个公共节点
 * @create : 2020/05/22 06:46
 */
public class Main36 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode listNodeA = pHead1;
        ListNode listNodeB = pHead2;
        while (listNodeA != listNodeB) {
            listNodeA = listNodeA == null ? pHead1 : listNodeA.next;
            listNodeB = listNodeB == null ? pHead2 : listNodeB.next;
        }
        return listNodeA;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA, b = headB;
        int lengthA = getLength(headA);
        int lengthB = getLength(headB);
        if (lengthA > lengthB) {
            for (int i = 0; i <lengthA-lengthB ; i++) {
                a = a.next;
            }
        }else {
            for (int i = 0; i <lengthB - lengthA ; i++) {
                b = b.next;
            }
        }
        while (a !=b){
            a = a.next;
            b = b.next;
        }
        return a;
    }

    private int getLength(ListNode head) {
        int length =0;
        for (ListNode temp = head;temp!=null;temp = temp.next,length++);
        return length;
    }
}
