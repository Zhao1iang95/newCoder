import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
import java.util.Vector;

/**
 * @desc 输入一个链表，反转链表后，输出新链表的表头。
 * @author zhaoliang
 * @date 20200430
 */
public class Main15 {
    //输入一个链表，反转链表后，输出新链表的表头。
    public static ListNode ReverseList(ListNode head) {
    //三指针操作
    ListNode pre =null;
    ListNode temp =null;
    ListNode cur =head;
    while (cur!=null){
        temp = cur.next;
        cur.next = pre;
        pre = cur;
        cur = temp;
    }
    return pre;
    }

}
