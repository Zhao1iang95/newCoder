package leetCodeGroup.tree;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 判断二叉树路径和等于给定数的个数
 * @create : 2020/07/22 10:08
 */
public class LeetCode437II {
    public int pathSum(TreeNode root,int sum){
        if(root==null) return 0;//空，返回0
        //判断从当前计算，左子节点计算，右子节点计算，计算和
        int ret = helper(root,sum)+pathSum(root.left,sum)+pathSum(root.right,sum);
        return ret;
    }

    private int helper(TreeNode root, int sum) {
        if(root==null)return 0;
        int ret =0;
        if(root.val==sum)//
            ret++;
        //递归计算下一个节点值
        ret+=helper(root.left,sum-root.val)+helper(root.right,sum-root.val);
        return ret;
    }
}
