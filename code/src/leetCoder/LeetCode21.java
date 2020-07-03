package leetCoder;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 合并两个有序链表
 * @create : 2020/06/10 09:30
 */
public class LeetCode21 {
    //将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode mergeNode = new ListNode(-1);
        ListNode prev = mergeNode;

        while (l1!=null && l2!=null){
           if (l1.val<=l2.val){
               prev.next = l1;
               l1 = l1.next;
           }else {
               prev.next = l2;
               l2 = l2.next;
           }
            prev = prev.next;
        }
        prev.next = l1 == null ? l2 : l1;

        return mergeNode.next;
    }
    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        if (l1==null){
            return l2;
        }else if (l2==null){
            return l1;
        }else if(l1.val <l2.val){
            l1.next = mergeTwoLists2(l1.next,l2);
            return l1;
        }else {
            l2.next = mergeTwoLists2(l1,l2.next);
            return l2;
        }
    }
}
