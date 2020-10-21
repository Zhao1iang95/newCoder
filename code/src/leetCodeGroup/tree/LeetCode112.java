package leetCodeGroup.tree;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 判断路径和是否等于一个数
 * @create : 2020/07/22 09:42
 */
public class LeetCode112 {
    //给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
    //
    //说明: 叶子节点是指没有子节点的节点。
    public boolean hasPathSum(TreeNode root,int sum){
        return helper(root,sum);
    }

    private boolean helper(TreeNode root, int sum) {
        if (root==null)return false;
        if(root.left==null && root.right==null && root.val==sum)return true;
        return helper(root.left,sum-root.val)||helper(root.right,sum-root.val);
    }
}
