package leetCodeGroup.tree;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 二叉树的直径
 * @create : 2020/07/21 10:31
 */
public class LeetCode543 {
    private int res;
    public int diameterOfBinaryTree(TreeNode root){
        res =1;
        helper(root);
        return res-1;
    }

    private int helper(TreeNode root) {
        if (root==null)return 0;//为空，返回深度0
        int left = helper(root.left);//左子树高度
        int right = helper(root.right);//右子树高度
        res = Math.max(res,left+right+1);//比较当前节点左右子树和与当前记录的最大高度比较
        return Math.max(left,right)+1;//返回当前高度
    }
}
