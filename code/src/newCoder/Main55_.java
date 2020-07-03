/**
 * @desc 平衡二叉树
 * @author zhaoliang
 * @date 20200417
 */

public class Main55_ {
    public class TreeNode {
        int val = 0;
       TreeNode left = null;
       TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    //输入一棵二叉树，判断该二叉树是否是平衡二叉树。

    private boolean ans ;
    public boolean IsBalanced_Solution(TreeNode root) {

        if (root == null){
            return true;
        }
        ans = true;
        TreeDepth(root);

        return ans;
    }

    private int TreeDepth(TreeNode node) {

        if (node == null){
            return 0;
        }
        if (ans){ //剪枝操作
            int leftDepth = TreeDepth(node.left);//求当前左子树的高度
            int rightDepth = TreeDepth(node.right);//求当前右子树的高度
            //abs返回绝对值
            if (Math.abs(leftDepth - rightDepth) > 1){
                ans = false;
            }
            return Math.max(leftDepth,rightDepth) + 1;

        }
        return 0;
    }
}
