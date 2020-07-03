package leetCoder;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 对称二叉树
 * @create : 2020/06/25 09:53
 */
public class LeetCode101 {

    // 给定一个二叉树，检查它是否是镜像对称的,递归
    public boolean isSymmetric(TreeNode root) {
        return helper(root,root);
    }

    private boolean helper(TreeNode root1, TreeNode root2) {
        if (root1==null && root2==null) return true;
        if (root1==null || root2 ==null) return false;
        return (root1.val==root2.val) && helper(root1.left,root2.right) && helper(root1.right,root2.left);
    }
    //迭代
    public boolean isSymmetric1(TreeNode root){

        if (root == null || (root.left==null && root.right == null)){
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root.left);
        queue.add(root.right);
        while (!queue.isEmpty()){
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();
            if (left == null && right == null) continue;
            if (left == null || right == null) return false;
            if (left.val !=right.val) return false;
            queue.add(left.left);
            queue.add(right.right);
            queue.add(left.right);
            queue.add(right.left);
        }
        return true;
    }
}
