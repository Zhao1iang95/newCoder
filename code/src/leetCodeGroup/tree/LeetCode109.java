package leetCodeGroup.tree;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 根据有序链表构造平衡的二叉查找树
 * @create : 2020/07/28 08:58
 */
class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val =x;
    }
}
public class LeetCode109 {
    //给定一个单链表，其中的元素按升序排序，将其转换为高度平衡的二叉搜索树。
    //
    //本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
    public TreeNode sortedListToBST(ListNode head){
        if(head==null)return null;
        if(head.next==null)return new TreeNode(head.val);
        ListNode preMid = helper(head);
        ListNode mid = preMid.next;
        preMid.next = null;//断开链表
        TreeNode root = new TreeNode(mid.val);
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(mid.next);
        return root;

    }

    private ListNode helper(ListNode head) {
        ListNode pre=head,slow = head,fast = head.next;
        while(fast!=null && fast.next!=null){
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        return pre;
    }
}
