package leetCodeGroup.tree;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 二叉树中第二小的节点
 * @create : 2020/07/23 14:13
 */
public class LeetCode671 {
    //给定一个非空特殊的二叉树，每个节点都是正数，并且每个节点的子节点数量只能为 2 或 0。如果一个节点有两个子节点的话，那么该节点的值等于两个子节点中较小的一个。
    //
    //给出这样的一个二叉树，你需要输出所有节点中的第二小的值。如果第二小的值不存在的话，输出 -1 。
    public int findSecondMinimumValue(TreeNode root){
        return helper(root);
    }

    private int helper(TreeNode root) {
        if(root==null)return -1;
        int leftVal =root.left.val;
        int rightVal = root.right.val;
        if(leftVal==root.val){
           leftVal = helper(root.left);
        }
        if(rightVal == root.val){
            rightVal = helper(root.right);
        }
        if(leftVal!=-1 && rightVal!=-1){
            return Math.min(leftVal,rightVal);
        }
        if(leftVal!=-1){
            return leftVal;
        }
        return rightVal;
    }
}
