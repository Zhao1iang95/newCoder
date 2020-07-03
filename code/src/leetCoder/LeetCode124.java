package leetCoder;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 二叉树中的最大路径和
 * @create : 2020/06/29 08:39
 */

public class LeetCode124 {
    //给定一个非空二叉树，返回其最大路径和。
    //本题中，路径被定义为一条从树中任意节点出发，达到任意节点的序列。该路径至少包含一个节点，且不一定经过根节点。
    int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root){
    maxGain(root);
    return maxSum;
    }

    private int maxGain(TreeNode node) {
        if (node == null)return 0;

        int LeftGain = Math.max(maxGain(node.left),0);
        int RightGain = Math.max(maxGain(node.right),0);
        int priceNewPath = node.val + LeftGain + RightGain;

        maxSum = Math.max(maxSum,priceNewPath);

        return node.val + Math.max(LeftGain,RightGain);
    }
}
