package SFOffer;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 两个链表的第一个公共结点
 * @create : 2020/10/04 08:59
 */
public class Test52 {
    //输入两个链表，找出它们的第一个公共结点。
    //（注意因为传入数据是链表，所以错误测试数据的提示是用其他方式显示的，保证传入数据是正确的）
    public ListNode FindFirstCommonNode(ListNode pHead1,ListNode pHead2){
        ListNode l1 = pHead1,l2 = pHead2;
        while (l1!=l2){
            l1 = (l1 == null)?pHead2:l1.next;
            l2 = (l2 == null)?pHead1:l2.next;
        }
        return l1;
    }
}
