package leetCodeGroup.division;

import java.util.LinkedList;
import java.util.List;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 不同的二叉搜索树II
 * @create : 2020/08/25 09:39
 */
public class LeetCode95 {
    //给定一个整数 n，生成所有由 1 ... n 为节点所组成的 二叉搜索树 。
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int val){
        this.val = val;
    }
    TreeNode(int val,TreeNode left,TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
    }
    public List<TreeNode> generateTrees(int n){
        if (n==0){
            return new LinkedList<TreeNode>();
        }
        return generateTrees(1,n);
    }
    public List<TreeNode> generateTrees(int start,int end){
        List<TreeNode> res= new LinkedList<TreeNode>();
        if(start>end){
            res.add(null);
            return res;
        }
        //枚举可行根结点
        for (int i = start; i <=end ; i++) {
            //获得所有可行左子树集合
            List<TreeNode> left = generateTrees(start,i-1);
            //可行右子树集合
            List<TreeNode> right = generateTrees(i+1,end);
            //左子树选择一棵，右子树集合选择一棵
            for(TreeNode leftNode:left){
                for (TreeNode rightNode:right){
                    TreeNode curNode = new TreeNode(i);
                    curNode.left = leftNode;
                    curNode.right = rightNode;
                    res.add(curNode);
                }
            }
        }
    return res;
    }
}
