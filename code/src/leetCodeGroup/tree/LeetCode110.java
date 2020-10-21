package leetCodeGroup.tree;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 平衡二叉树
 * @create : 2020/07/21 08:56
 */
public class LeetCode110 {
    //给定一个二叉树，判断它是否是高度平衡的二叉树。
    //暴力，自顶向下
    public boolean isBalanced(TreeNode root){
        if(root==null)return true;
        int left = helper(root.left);
        int right = helper(root.right);
        return (Math.abs(left-right)<=1) && isBalanced(root.left) && isBalanced(root.right);
    }

    private int helper(TreeNode root) {
        if(root==null){
            return 0;
        }

        int left = helper(root.left);
        int right = helper(root.right);
        return Math.max(left,right)+1;
    }
    //
    private boolean result = true;
    public boolean isBalanced1(TreeNode root){
        helper1(root);
        return result;
    }
    private int helper1(TreeNode root){
     if(root==null)return 0;
     int left = helper1(root.left);
     int right = helper1(root.right);
     if(Math.abs(left-right)>1){
         result = false;
     }
     return Math.max(left,right)+1;
    }
}
