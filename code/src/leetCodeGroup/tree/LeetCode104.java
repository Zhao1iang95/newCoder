package leetCodeGroup.tree;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 二叉树的高度
 * @create : 2020/07/19 14:52
 */
public class LeetCode104 {
    //二叉树的深度
    public int maxDepth(TreeNode root){
        return helper(root);
    }

    private int helper(TreeNode root) {
        if (root==null)return 0;
        int left = helper(root.left);
        int right = helper(root.right);
        return Math.max(left,right)+1;
    }
}
