package leetCoder;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 二叉树的最大深度
 * @create : 2020/06/26 20:41
 */
public class LeetCode104 {
    //给定一个二叉树，找出其最大深度。
    //
    //二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
    //
    //说明: 叶子节点是指没有子节点的节点。
    //递归
    public int MaxDepth(TreeNode root){
        if (root == null) return 0;
        int leftDepth = MaxDepth(root.left);
        int rightDepth = MaxDepth(root.right);
        return Math.max(leftDepth,rightDepth) +1;
    }
    //BFS
    public int MaxDepth1(TreeNode treeNode){
        if(treeNode == null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(treeNode);
        int MaxDepth = 0;
        while (!queue.isEmpty()){
            MaxDepth++;
            int size = queue.size();
            for (int i = 0; i <size; i++) {
                TreeNode cur = queue.peek();
                queue.poll();
                if (cur==null)continue;
                if (cur.left!=null)queue.offer(cur.left);
                if (cur.right!=null)queue.offer(cur.right);
            }
        }
        return MaxDepth;
    }
}
