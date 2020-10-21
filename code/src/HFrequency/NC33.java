package HFrequency;

public class NC33 {
    //合并有序链表

    public class ListNode{
        int val;
        ListNode next = null;
        ListNode(int val){
            this.val = val;
        }
    }
    public ListNode mergeTwoLists(ListNode l1,ListNode l2){
        if(l1==null)return l2;
        if(l2==null)return l1;
        ListNode mergeNode = new ListNode(0);
        ListNode p = mergeNode;
        while(l1!=null && l2!=null){
            if(l1.val <=l2.val){
                p.next = l1;
                p = p.next;
                l1 = l1.next;
            }else {
                p.next = l2;
                p = p.next;
                l2 = l2.next;
            }

        }
        if(l1!=null){
            p.next = l1;
        }
        if(l2!=null){
            p.next = l2;
        }
        return mergeNode.next;
    }
}
