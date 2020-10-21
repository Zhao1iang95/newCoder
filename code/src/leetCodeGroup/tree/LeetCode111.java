package leetCodeGroup.tree;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 二叉树的最小深度
 * @create : 2020/07/20 09:30
 */
public class LeetCode111 {
    //给定一个二叉树，找出其最小深度。
    //
    //最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
    //
    //说明: 叶子节点是指没有子节点的节点。
    public int minDepth(TreeNode root) {
        return helper(root);
    }
    private int helper(TreeNode root){
        if(root==null)return 0;
        int left = helper(root.left);
        int right = helper(root.right);
        if(left==0||right==0)return left+right+1;
        return Math.min(left,right)+1;
    }
}
