package SFOffer;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 合并两个排序列表
 * @create : 2020/09/25 09:48
 */
public class Test25 {
    //输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
    public ListNode Merge1(ListNode list1,ListNode list2){
        //递归
        if (list1==null)return list2;
        if (list2==null)return list1;
        if (list1.val <= list2.val){
            list1.next = Merge1(list1.next,list2);
            return list1;
        }else {
            list2.next = Merge1(list1,list2.next);
            return list2;
        }
    }
    public ListNode Merge2(ListNode list1,ListNode list2){
        //迭代
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        while (list1!=null && list2!=null){
            if (list1.val <=list2.val){
                cur.next = list1;
                list1 = list1.next;
            }else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        if (list1!=null){
            cur.next = list1;
        }
        if (list2!=null){
            cur.next = list2;
        }
        return head.next;
    }
}
