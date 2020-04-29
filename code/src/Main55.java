/**
 * @desc 二叉树的深度
 * @author zhaoliang
 * @date 20200417
 */
public class Main55 {
    //
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    public int TreeDepth(TreeNode root) {
    if (root == null){
        return 0;
    }
    return Math.max(TreeDepth(root.left),TreeDepth(root.right)) + 1;//+1就是当前node对路径产生的影响
    }
}
