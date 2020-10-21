package leetCodeGroup.tree;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 打家劫舍III（间隔遍历）
 * @create : 2020/07/23 10:20
 */
public class LeetCode337 {
    //在上次打劫完一条街道之后和一圈房屋后，小偷又发现了一个新的可行窃的地区。
    // 这个地区只有一个入口，我们称之为“根”。 除了“根”之外，每栋房子有且只有一个“父“房子与之相连。
    // 一番侦察之后，聪明的小偷意识到“这个地方的所有房屋的排列类似于一棵二叉树”。
    // 如果两个直接相连的房子在同一天晚上被打劫，房屋将自动报警。
    //计算在不触动警报的情况下，小偷一晚能够盗取的最高金额
    public int rob(TreeNode root){
        return  helper(root);
}

    private int helper(TreeNode root) {
        if (root==null) return 0;
        int val1 = root.val;
        if(root.left!=null){
            val1+=helper(root.left.left)+helper(root.left.right);
        }
        if(root.right!=null){
            val1+=helper(root.right.left)+helper(root.right.right);
        }
        int val2 = helper(root.left)+helper(root.right);
        return Math.max(val1,val2);
    }
    }
