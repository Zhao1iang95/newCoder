package SFOffer;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 删除链表中重复的节点
 * @create : 2020/09/24 08:37
 */
public class Test18II {
    //在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
    //例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
    public ListNode deleteDuplication(ListNode pHead){
        if (pHead == null || pHead.next == null){
            return pHead;
        }
        ListNode next = pHead.next;
        if (pHead.val == next.val){
            while (next!=null && pHead.val == next.val){
                next = next.next;
            }
            return deleteDuplication(next);
        }else {
            pHead.next = deleteDuplication(pHead.next);
            return pHead;
        }
    }
}
