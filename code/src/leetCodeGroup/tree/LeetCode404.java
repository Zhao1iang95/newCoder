package leetCodeGroup.tree;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 左叶子之和
 * @create : 2020/07/19 13:43
 */
public class LeetCode404 {
    //计算给定二叉树的所有左叶子之和。
    //递归
    public int sumOfLeftLeaves(TreeNode root){
        return helper(root,false);
    }
    int helper(TreeNode root,boolean flag){
        if(root==null)return 0;
        if(flag && root.left==null && root.right==null){
            return root.val;
        }
        int n1 = helper(root.left,true);
        int n2 = helper(root.right,false);
        return n1+n2;
    }
    //迭代
}
