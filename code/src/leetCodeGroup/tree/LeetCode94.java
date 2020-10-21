package leetCodeGroup.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 二叉树的中序遍历
 * @create : 2020/07/24 10:30
 */
public class LeetCode94 {
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        if(root==null)return res;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (!stack.isEmpty() || cur!=null){
            while (cur!=null){
                stack.add(cur);
                cur = cur.left;
            }
            TreeNode node = stack.pop();
            res.add(node.val);
            cur = node.right;
        }
        return res;
    }

    public static void main(String[] args) {
        int a = '2';
        System.out.println(a);
    }
}
