package leetCodeGroup.tree;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 修剪二叉树
 * @create : 2020/07/25 08:45
 */
public class LeetCode669 {
    public TreeNode trimBST(TreeNode root,int L,int R){
        return helper(root,L,R);
    }

    private TreeNode helper(TreeNode root, int l, int r) {
        if (root==null) return null;
        if(root.val>r)return helper(root.left,l,r);
        if(root.val<l)return helper(root.right,l,r);
        root.left = helper(root.left,l,r);
        root.right = helper(root.right,l,r);
        return root;
    }
}
