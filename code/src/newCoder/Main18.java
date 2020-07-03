/**
 * @desc 二叉树的镜像
 * @author zhaoliang
 * @date 20200505
 */
public class Main18 {
    //操作给定的二叉树，将其变换为源二叉树的镜像。
    public void Mirror(TreeNode node) {

        if (node != null){
            if (node.left!=null){
                Mirror(node.left);
            }
            if (node.right!=null){
                Mirror(node.right);
            }
            //交换node节点的左右孩子
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
        }
    }
        //leetcode返回值TreeNode
        public TreeNode mirrorTree(TreeNode root) {
            if(root == null) return null;
            TreeNode tmp = root.left;
            root.left = mirrorTree(root.right);
            root.right = mirrorTree(tmp);
            return root;
        }
}
