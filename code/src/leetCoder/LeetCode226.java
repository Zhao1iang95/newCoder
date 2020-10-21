package leetCoder;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 翻转二叉树
 * @create : 2020/07/10 10:37
 */
public class LeetCode226 {
    //翻转一棵二叉树。
    //递归
    public TreeNode invertTree(TreeNode root){
        if (root==null){
            return null;
        }
        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);
        root.left = right;
        root.right = left;
        return root;
    }
    //迭代
    public  TreeNode invertTree1(TreeNode root){
        if (root ==null){
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode current = queue.poll();
            TreeNode temp = current.left;
            current.left = current.right;
            current.right = temp;
            if (current.left!=null) queue.add(current.left);
            if (current.right!=null) queue.add(current.right);
        }
        return root;
    }
}
