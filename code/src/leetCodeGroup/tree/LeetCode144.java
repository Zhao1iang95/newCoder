package leetCodeGroup.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 二叉树的前序遍历
 * @create : 2020/07/24 09:43
 */
public class LeetCode144 {
    //给定一个二叉树，返回它的 前序 遍历。
    //递归
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        return dfs(root,res);
    }

    private List<Integer> dfs(TreeNode root, List<Integer> res) {
        if(root==null)return res;
        res.add(root.val);
        dfs(root.left,res);
        dfs(root.right,res);
        return res;
    }
    //非递归
    public List<Integer> preorderTraversal1(TreeNode root){
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            if (node==null)continue;
            res.add(node.val);
            stack.push(node.right);
            stack.push(node.left);

        }
        return res;
    }


}
