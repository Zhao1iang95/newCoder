package leetCodeGroup.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 二叉树层的平均值
 * @create : 2020/07/24 08:51
 */
public class LeetCode637 {
    //给定一个非空二叉树, 返回一个由每层节点平均值组成的数组。
    public List<Double> averageOfLevels(TreeNode root){
        List<Double> res = new ArrayList<>();
        return bfs(root,res);
    }

    private List<Double> bfs(TreeNode root, List<Double> res) {
        if(root==null)return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int cnt = queue.size();
            double sum =0;
            for (int i = 0; i <cnt ; i++) {
            TreeNode node = queue.poll();
            sum+=node.val;
            if(root.left!=null)queue.add(root.left);
            if(root.right!=null)queue.add(root.right);
            }
            res.add(sum/cnt);
        }
        return res;
    }
}
