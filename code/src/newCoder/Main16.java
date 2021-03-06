/**
 * @author zhaoliang
 * @desc 合并两个排序链表
 * @date 20200430
 */
public class Main16 {
    //输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
    public ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;
        ListNode headNode;
        //确定表头
        if (list1.val > list2.val) {
            headNode = list2;
            list2=list2.next;
        } else {
            headNode = list1;
            list1=list1.next;
        }

        ListNode tailNode = headNode;
        //比较list1与list2中的节点大小拼接新的链表
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tailNode.next = list1;
                tailNode = list1;
                list1 = list1.next;
            } else {
                tailNode.next = list2;
                tailNode = list2;
                list2 = list2.next;
            }
        }
        //list2先为空
        while (list1 != null) {
            tailNode.next = list1;
            tailNode = list1;
            list1 = list1.next;
        }
        //list1先唯恐
        while (list2 != null) {
            tailNode.next = list2;
            tailNode = list2;
            list2 = list2.next;
        }
        return headNode;
    }
}
