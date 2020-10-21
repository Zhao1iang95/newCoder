package HFrequency;

public class NC53 {
    //给定一个链表，删除链表的倒数第n个节点并返回链表的头指针
    public class ListNode{
        int val;
        ListNode next = null;
        ListNode(int v){
            this.val = v;
        }
    }
    public ListNode removeNthFromEnd(ListNode head,int n){
        if (head == null)return head;
        ListNode newHead = new ListNode(0);
        newHead.next =head;
        ListNode left = newHead;
        ListNode right = newHead;
        for (int i = 0; i <n ; i++) {
            right = right.next;
        }
        while (right.next!=null){
            right = right.next;
            left = left.next;
        }
        if (left.next!=null)left.next = left.next.next;//删除指定结点操作
        return newHead.next;
    }
}
