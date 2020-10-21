package leetCodeGroup.tree;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 二叉搜索树的最小绝对差
 * @create : 2020/07/28 09:43
 */
public class LeetCode530 {
    private int minDiff = Integer.MAX_VALUE;
    private TreeNode preNode =null;
    public int getMinimumDifference(TreeNode root){
        inOrder(root);
        return  minDiff;
    }

    private void inOrder(TreeNode root) {
        if (root==null)return;
        inOrder(root.left);
        if (preNode!=null){
            minDiff = Math.min(minDiff,root.val-preNode.val);
        }
        preNode = root;
        inOrder(root.right);
    }

}
