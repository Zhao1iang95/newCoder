package SFOffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 从头到尾打印链表
 * @create : 2020/09/21 15:53
 */
public class Test6 {
    //输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
    public ArrayList<Integer> printListFromTailToHead1(ListNode listNode){
        //要逆序打印链表 1->2->3（3,2,1)，可以先逆序打印链表 2->3(3,2)，最后再打印第一个节点 1。
        // 而链表 2->3 可以看成一个新的链表，要逆序打印该链表可以继续使用求解函数，也就是在求解函数中调用自己，这就是递归函数。
        ArrayList<Integer> ret = new ArrayList<>();
        if (listNode !=null){
            ret.addAll(printListFromTailToHead1(listNode.next));
            ret.add(listNode.val);
        }
        return ret;
    }
    public ArrayList<Integer> printListFromTailToHead2(ListNode listNode){
    //头插法顾名思义是将节点插入到头部：在遍历原始链表时，将当前节点插入新链表的头部，使其成为第一个节点。。
        ListNode head = new ListNode(-1);
        while (listNode!=null){
            ListNode memo = listNode.next;
            listNode.next = head.next;
            head.next = listNode;
            listNode = memo;
        }
        ArrayList<Integer> ret = new ArrayList<>();
        head = head.next;
        while (head!=null){
            ret.add(head.val);
            head = head.next;
        }
        return ret;
    }
    public ArrayList<Integer> printListFromTailToHead3(ListNode listNode){
    //栈具有后进先出的特点，在遍历链表时将值按顺序放入栈中，最后出栈的顺序即为逆序
        Stack<Integer> stack = new Stack<>();
        while (listNode!=null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> ret = new ArrayList<>();
        if (!stack.isEmpty()){
            ret.add(stack.pop());
        }
        return ret;
    }
}
