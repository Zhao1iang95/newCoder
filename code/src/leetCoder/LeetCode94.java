package leetCoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 二叉树的中序遍历
 * @create : 2020/06/24 08:24
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}
public class LeetCode94 {
    //给定一个二叉树，返回它的中序遍历。
    //递归
    public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    helper(root,res);
    return res;
    }

    private void helper(TreeNode root, List<Integer> res) {
        if (root!=null){
            if (root.left!=null){
                helper(root.left,res);
            }
            res.add(root.val);
            if (root.right!=null){
                helper(root.right,res);
            }
        }
    }
    //迭代
    public List<Integer> inorderTraversal1(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while (curr!=null || !stack.isEmpty()){
            while (curr!=null){
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            res.add(curr.val);
            curr = curr.right;
        }
        return res;
    }
}
