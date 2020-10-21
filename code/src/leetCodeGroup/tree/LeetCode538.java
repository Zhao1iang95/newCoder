package leetCodeGroup.tree;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description :  把二叉搜索树转换为累加树
 * @create : 2020/07/27 09:15
 */
public class LeetCode538 {
    private int sum=0;
    public TreeNode convertBST(TreeNode root){
        helper(root);
        return root;
    }

    private void helper(TreeNode root) {
        if(root==null)return;
        helper(root.right);
        sum+=root.val;
        root.val = sum;
        helper(root.left);
    }

}
