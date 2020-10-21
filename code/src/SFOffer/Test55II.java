package SFOffer;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 平衡二叉树
 * @create : 2020/10/04 09:48
 */
public class Test55II {
    //输入一棵二叉树，判断该二叉树是否是平衡二叉树。
    //在这里，我们只需要考虑其平衡性，不需要考虑其是不是排序二叉树
    private boolean isBalanced = true;
    public boolean IsBalanced_Solution(TreeNode root){
        height(root);
        return isBalanced;
    }

    private int height(TreeNode root) {
        if (root==null || !isBalanced){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        if (Math.abs(left - right) >1){
            isBalanced = false;
        }
        return 1+Math.max(left,right);
    }
}
