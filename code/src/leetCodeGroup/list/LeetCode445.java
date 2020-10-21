package leetCodeGroup.list;

import java.util.Stack;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 链表求和
 * @create : 2020/07/31 09:18
 */
public class LeetCode445 {
    //给你两个 非空 链表来代表两个非负整数。数字最高位位于链表开始位置。它们的每个节点只存储一位数字。将这两数相加会返回一个新的链表。
    //
    //你可以假设除了数字 0 之外，这两个数字都不会以零开头。
    public ListNode addSumTows(ListNode l1,ListNode l2){
        Stack<Integer> stack1 = helper(l1);
        Stack<Integer> stack2 = helper(l2);
        ListNode head = new ListNode(-1);
        int carry = 0;
        while (!stack1.isEmpty() || !stack2.isEmpty() || carry!=0){
            int x = stack1.isEmpty()?0:stack1.pop();
            int y = stack2.isEmpty()?0:stack2.pop();
            int sum = x + y + carry;
            ListNode node  =new ListNode(sum%10);
            node.next = head.next;
            head.next = node;
            carry = sum/10;
        }
        return head;
    }

    private Stack<Integer> helper(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head!=null){
            stack.add(head.val);
            head = head.next;
        }
        return stack;
    }
}
