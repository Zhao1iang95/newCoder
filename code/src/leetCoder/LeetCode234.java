package leetCoder;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 回文链表
 * @create : 2020/07/11 09:20
 */
public class LeetCode234 {
    //请判断一个链表是否为回文链表。
    //栈
    public boolean isPalindrome(ListNode node){

        ListNode head = node;
        Stack<Integer> stack = new Stack<>();

        while (node!=null){
            stack.add(node.val);
            node = node.next;
        }
        boolean flag = true;
        while (!stack.isEmpty()){
            if (stack.pop()!=head.val){
                flag =false;
                break;
            }
            head = head.next;
        }
        return flag;
    }
    //快慢指针+翻转链表
    public boolean isPalindrome1(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode p = new ListNode(-1);
        ListNode slow = head;
        ListNode fast = head;
        p.next = head;
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode current = slow.next;
        ListNode pre =null;
        slow.next =null;
        slow = p.next;
        while (current!=null){
            ListNode temp = current.next;
            current.next = pre;
            pre = current;
            current = temp;
        }
        while (pre!=null){
            if (slow.val!=pre.val){
                return false;
            }
            slow=slow.next;
            pre = pre.next;
        }
        return true;
    }
    //数组
    public boolean isPalindrome2(ListNode head){
        if (head==null || head.next==null){
            return true;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (head!=null){
            arrayList.add(head.val);
            head = head.next;
        }
        int start = 0;
        int end = arrayList.size()-1;
        while (start!=end){
            if (!arrayList.get(start).equals(arrayList.get(end))){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
