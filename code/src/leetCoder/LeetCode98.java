package leetCoder;

import java.util.Stack;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 验证二叉树
 * @create : 2020/06/25 08:46
 */
public class LeetCode98 {
    //给定一个二叉树，判断其是否是一个有效的二叉搜索树。
    //
    //假设一个二叉搜索树具有如下特征：
    //
    //节点的左子树只包含小于当前节点的数。
    //节点的右子树只包含大于当前节点的数。
    //所有左子树和右子树自身必须也是二叉搜索树
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        double inorder = -Double.MAX_VALUE;

        while (!stack.isEmpty() || root!=null){
            while (root!=null){
                stack.push(root);
                root =root.left;
            }
            root = stack.pop();
            if (root.val <= inorder)return false;
            inorder = root.val;
            root = root.right;
        }
        return true;
    }
    //中序遍历
    long pre = Long.MIN_VALUE;
    public boolean isValidBST1(TreeNode root){
        if (root ==null){
            return true;
        }
        if (!isValidBST1(root.left)){
            return false;
        }
        if (root.val <= pre){
            return false;
        }
        pre = root.val;
        return isValidBST1(root.right);
    }
}
