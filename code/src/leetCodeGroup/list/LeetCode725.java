package leetCodeGroup.list;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 分隔链表
 * @create : 2020/07/31 10:49
 */
public class LeetCode725 {
    //给定一个头结点为 root 的链表, 编写一个函数以将链表分隔为 k 个连续的部分。
    //
    //每部分的长度应该尽可能的相等: 任意两部分的长度差距不能超过 1，也就是说可能有些部分为 null。
    //
    //这k个部分应该按照在链表中出现的顺序进行输出，并且排在前面的部分的长度应该大于或等于后面的长度。
    //
    //返回一个符合上述规则的链表的列表。
    public ListNode[] splitListToParts(ListNode root,int k){
        int N = 0;
        ListNode cur = root;
        while (cur!=null){
            N++;
            cur = cur.next;
        }
        int mod  = N % k;
        int size = N /k;
        ListNode ret[] = new ListNode[k];
        cur = root;
        for (int i = 0;cur!=null &&i <k ; i++) {
            ret[i] = cur;
            int cutSize = size+(mod-- >0?1:0);
            for (int j = 0; j <cutSize-1 ; j++) {
                 cur = cur.next;
            }
            ListNode next = cur.next;
            cur.next = null;
            cur = next;
        }
        return ret;
    }
}
