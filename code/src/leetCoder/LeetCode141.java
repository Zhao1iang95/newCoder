package leetCoder;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 环形链表
 * @create : 2020/07/01 08:54
 */
public class LeetCode141 {
    //给定一个链表，判断链表中是否有环。
    //
    //为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
    public boolean hasCycle(ListNode head){
        Set<ListNode> set = new HashSet<>();
        while (head!=null){
            if (set.contains(head)){
                return true;
            }
            set.add(head);
            head = head.next;
        }
        return false;
    }
    //快慢指针
    public boolean hasCycle1(ListNode head){
        if (head == null || head.next == null){
            return false;
        }
        ListNode first = head;
        ListNode fast = head.next;
        while (first!=fast){
            if (fast == null || fast.next == null){
                return false;
            }
            first = first.next;
            fast = fast.next.next;
        }
        return true;
    }
}
