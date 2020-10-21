package leetCodeGroup.list;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 从有序链表中删除重复元素
 * @create : 2020/07/30 11:03
 */
public class LeetCode83 {
    public ListNode deleteDuplicates(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
         head.next = deleteDuplicates(head.next);
         if(head.val == head.next.val){
             return head.next;
         }else {
             return head;
         }
    }
}
