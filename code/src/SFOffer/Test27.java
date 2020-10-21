package SFOffer;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 二叉树的镜像
 * @create : 2020/09/27 08:34
 */
public class Test27 {
    //操作给定的二叉树，将其变换为源二叉树的镜像
    public void Mirror(TreeNode root){
        if (root==null)return;
        swap(root);
        Mirror(root.left);
        Mirror(root.right);
    }

    private void swap(TreeNode root) {
        TreeNode t = root.left;
        root.left = root.right;
        root.right = t;
    }
}
