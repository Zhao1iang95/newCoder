package HFrequency;

public class NC4 {
    //判断给定的链表中是否有环
    //扩展：
    //你能给出空间复杂度o(1)的解法么？
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public boolean hasCycle(ListNode node){
        if(node == null)return false;
        ListNode slow = node,fast = node;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return  true;
            }
        }
        return false;
    }
}
