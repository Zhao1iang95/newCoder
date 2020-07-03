package leetCoder;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 环形链表II
 * @create : 2020/07/01 09:45
 */
public class LeetCode142 {
    //给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
    //
    //为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
    //HASH
    public ListNode detectCycle(ListNode head){
        Set<ListNode> set = new HashSet<>();
        while(head!=null){
            if(set.contains(head)){
                return head;
            }
            set.add(head);
            head = head.next;
        }
        return null;
    }
    //快慢指针
    public ListNode detectCycle1(ListNode head){
        if (head == null || head.next==null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(true){
            if (fast==null || fast.next==null){
                return null;
            }
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow){
                break;
            }
        }
        fast = head;
        while (slow !=fast){
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }
}
