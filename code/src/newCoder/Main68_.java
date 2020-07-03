/**
 * @desc 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先
 * @author zhaoliang
 * @date 20200423
 */
public class Main68_ {
    //最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，
    // 满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
    TreeNode ans;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        traversingBinaryTree(root, p, q);
        return ans;
    }

    public boolean traversingBinaryTree(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)
            return false;
        if (root == p || root == q) {
            ans = root;
            return true;
        }
        boolean left = traversingBinaryTree(root.left, p, q);
        boolean right = traversingBinaryTree(root.right, p, q);
        if (left && right) {
            ans = root;
            return false;
        }
        return left || right;
    }
}
