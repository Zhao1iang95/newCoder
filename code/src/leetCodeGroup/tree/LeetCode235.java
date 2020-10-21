package leetCodeGroup.tree;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 二叉树的最近公共祖先
 * @create : 2020/07/20 08:51
 */
public class LeetCode235 {
    //给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
    public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q){
        return helper(root,p,q);
    }

    private TreeNode helper(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode temp;
        if(p.val>q.val){
            temp = p;
            p = q;
            q = temp;
        }
        if(root.val<p.val && root.right!=null){
            return helper(root.right,p,q);
        }else if(root.val>q.val && root.left!=null){
            return helper(root.left,p,q);
        }
        return root;
    }
}
