package leetCodeGroup.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 翻转二叉树
 * @create : 2020/07/21 10:49
 */
public class LeetCode226 {
    public TreeNode invertTree(TreeNode root){
        return helper(root);
    }
    private TreeNode helper(TreeNode root){
        if(root==null)return null;
//        TreeNode left = helper(root.left);
//        TreeNode right = helper(root.right);
//        root.right = left;
//        root.left = right;
//        return root;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node =queue.poll();
            TreeNode temp =null;
            temp = node.left;
            node.left = node.right;
            node.right = temp;
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }
        }
        return root;
    }
}
