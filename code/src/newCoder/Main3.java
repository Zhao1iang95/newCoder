import java.util.ArrayList;
import java.util.Stack;

/**
 * @author zhaoliang
 * @desc 从尾到头打印链表
 * @date 20200427
 */
public class Main3 {
    //输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
    public ArrayList<Integer> printListFromTailToHead1(ListNode listNode) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.add(listNode.val);
            listNode = listNode.next;
        }
        while (!stack.isEmpty()) {
            arrayList.add(stack.pop());
        }
        return arrayList;
    }

    //leetcode，返回数组
    public int[] printListFromTailToHead2(ListNode listNode) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.add(listNode.val);
            listNode = listNode.next;
        }
        while (!stack.isEmpty()) {
            arrayList.add(stack.pop());
        }
        int[] a = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            a[i] = arrayList.get(i);
        }
        return a;
    }
}
