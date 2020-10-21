package leetCodeGroup.tree;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 对称二叉树
 * @create : 2020/07/17 09:59
 */
public class LeetCode101 {
    //给定一个二叉树，检查它是否是镜像对称的。
    public boolean isSymmetric(TreeNode root){
        return helper(root,root);
    }
    boolean helper(TreeNode left,TreeNode right){
          if (left==null && right==null) return true;
          if(left==null || right==null)return false;
          return (left.val==right.val) && helper(left.left,right.right) && helper(left.right,right.left);
    }
}
