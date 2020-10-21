package leetCodeGroup.doublepointer;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 环形链表
 * @create : 2020/08/13 11:19
 */
public class LeetCode141 {
    //给定一个链表，判断链表中是否有环。
    //为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。
    // 如果 pos 是 -1，则在该链表中没有环。
    public boolean hasCycle(ListNode head){
        if (head==null)return false;
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow!=null && fast!=null && fast.next!=null){
            if(slow == fast){
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}
