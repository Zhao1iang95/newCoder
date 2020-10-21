package leetCodeGroup.search;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 二叉树的所有路径
 * @create : 2020/09/07 10:34
 */
public class LeetCode257 {
    //给定一个二叉树，返回所有从根节点到叶子节点的路径。
    public static class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;
        TreeNode(int x){
            val = x;
        }

    }
    public List<String> binaryTreePaths(TreeNode root){
        List<String> res = new ArrayList<>();
        if (root==null)return res;
        List<Integer> values = new ArrayList<>();
        dfs(root,values,res);
        return res;
    }

    private void dfs(TreeNode node, List<Integer> values, List<String> res) {
        if (node==null)return;
        values.add(node.val);
        if (isLeaf(node)){
            res.add(buildPath(values));
        }else {
            dfs(node.left,values,res);
            dfs(node.right,values,res);
        }
        values.remove(values.size()-1);
    }

    private String buildPath(List<Integer> values) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i <values.size() ; i++) {
            str.append(values.get(i));
            if (i!=values.size()-1){
                str.append("->");
            }
        }
        return str.toString();
    }

    private boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }

}
