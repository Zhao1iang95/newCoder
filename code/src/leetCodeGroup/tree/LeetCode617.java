package leetCodeGroup.tree;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 归并两棵树
 * @create : 2020/07/22 08:43
 */
public class LeetCode617 {
    public TreeNode mergeTree(TreeNode root1,TreeNode root2){
        return helper(root1,root2);
    }

    private TreeNode helper(TreeNode root1, TreeNode root2) {
        if(root1==null && root2==null) return null;
        if(root1==null)return root2;
        if(root2==null)return root1;
        TreeNode node = new TreeNode(root1.val+root2.val);
        node.left = helper(root1.left,root2.left);
        node.right = helper(root1.right,root2.right);
        return node;
    }
}
