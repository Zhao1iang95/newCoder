package leetCodeGroup.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 另一个树的子树
 * @create : 2020/07/22 10:20
 */
public class LeetCode572 {
    //给定两个非空二叉树 s 和 t，检验 s 中是否包含和 t 具有相同结构和节点值的子树。
    //s 的一个子树包括 s 的一个节点和这个节点的所有子孙。s 也可以看做它自身的一棵子树。
    public boolean isSubTree(TreeNode root1,TreeNode root2){
        if(root1==null)return false;
        return helper(root1,root2) || isSubTree(root1.left,root2) || isSubTree(root1.right,root2);
    }

    private boolean helper(TreeNode root, TreeNode root2) {
        if(root==null && root2==null)return true;
        if(root==null || root2==null)return false;
        if(root.val!=root2.val)return false;
        return helper(root.left,root2.left) && helper(root.right,root2.right);
    }
}
