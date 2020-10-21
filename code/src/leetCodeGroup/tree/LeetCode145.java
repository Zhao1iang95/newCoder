package leetCodeGroup.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 二叉树的后续遍历
 * @create : 2020/07/24 09:56
 */
public class LeetCode145 {
    //给定一个二叉树，返回它的 后序 遍历。
    public List<Integer> postorderTraversal(TreeNode root){
        List<Integer> res= new ArrayList<>();
        if(root==null) return res;
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            if(node==null)continue;
            res.add(node.val);
            stack.add(node.left);
            stack.add(node.right);

        }
        Collections.reverse(res);
        return res;
    }
}
