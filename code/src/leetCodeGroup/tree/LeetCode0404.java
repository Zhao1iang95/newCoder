package leetCodeGroup.tree;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 检查平衡性
 * @create : 2020/07/17 08:51
 */
class TreeNode{
    int val;
    TreeNode left,right;
    TreeNode(int x){
        val =x;
    }
}
public class LeetCode0404 {
    //实现一个函数，检查二叉树是否平衡。在这个问题中，平衡树的定义如下：任意一个节点，其两棵子树的高度差不超过 1。
    public boolean isBalanced(TreeNode root){
        if (root==null){
            return false;
        }
        int left = checkHeight(root.left);
        int right = checkHeight(root.right);
        if(Math.abs(left-right)>1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }
    int checkHeight(TreeNode node){
        if(node==null){
            return 0;
        }
        int left = checkHeight(node.left);
        int right = checkHeight(node.right);
        return Math.max(left,right)+1;

    }

}
