package leetCodeGroup.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 找树左下角的值
 * @create : 2020/07/24 09:09
 */
public class LeetCode513 {
    //给定一个二叉树，在树的最后一行找到最左边的值。
    private int res=Integer.MIN_VALUE;
    public int findBottomLeftValue(TreeNode root){
        bfs(root);
        return res;
    }

    private void bfs(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            res = node.val;
            if (node.right != null) queue.add(node.right);
            if (node.left != null) queue.add(node.left);

        }
    }
}
