package SFOffer;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 二叉搜索树与双向链表
 * @create : 2020/09/29 08:21
 */
public class Test36 {
    //输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向
    private TreeNode pre =null;
    private TreeNode head = null;
    public TreeNode Convert(TreeNode pRootOfTree){
        inOrder(pRootOfTree);
        return head;
    }

    private void inOrder(TreeNode node) {
        if (node==null)return;
        inOrder(node.left);
        node.left = pre;
        if (pre!=null)
            pre.right = node;
        pre = node;
        if (head == null)
            head = node;
        inOrder(node.right);
    }
}
