package leetCodeGroup.tree;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 二叉搜索树的最近公共祖先
 * @create : 2020/07/17 10:57
 */
public class LeetCode68 {
    //给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
    public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q){
        if(root==null || root==p || root==q) return root;

        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if(left==null)return right;
        if (right==null) return left;
        return root;
    }
}
