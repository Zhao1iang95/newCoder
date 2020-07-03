/**
 * @desc 输入一个链表，输出该链表中倒数第k个结点。
 * @author zhaoliang
 * @date 20200430
 */
public class Main14 {
    //输入一个链表，输出该链表中倒数第k个结点。
    public ListNode FindKthToTail(ListNode head,int k) {
        if (head==null || k==0){
            return null;
        }
        ListNode later =head;
        ListNode former =head;
        for (int i=0;i<k;i++){
            if (former==null){
                return null;
            }
            former=former.next;
        }
        while (former!=null){
            former = former.next;
            later = later.next;
        }

        return later;
    }
}
