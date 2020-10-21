package SFOffer;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 二叉树的深度
 * @create : 2020/10/04 09:42
 */
public class Test55I {
    //输入一棵二叉树，求该树的深度。
    //从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
    public int TreeDepth(TreeNode root){
        return root == null ?0:1+Math.max(TreeDepth(root.left),TreeDepth(root.right));
    }
}
