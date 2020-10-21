package leetCodeGroup.tree;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 最长同值路径
 * @create : 2020/07/23 09:42
 */
public class LeetCode687 {
    //给定一个二叉树，找到最长的路径，这个路径中的每个节点具有相同值。 这条路径可以经过也可以不经过根节点。
    //
    //注意：两个节点之间的路径长度由它们之间的边数表示。
    private int res = 0;
    public int longestUnivaluePath(TreeNode root){
        helper(root);
        return res;
    }

    private int helper(TreeNode root) {
        if(root==null)return 0;
        int left = helper(root.left);
        int right = helper(root.right);
        int leftPath = root.left!=null && root.left.val==root.val?left+1:0;
        int rightPath = root.right!=null && root.right.val==root.val?right+1:0;
        res = Math.max(res,leftPath+rightPath);
        return Math.max(leftPath,rightPath);

    }
}
