package leetCodeGroup.tree;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 寻找二叉查找树的第K小的元素
 * @create : 2020/07/27 08:47
 */
public class LeetCode230 {
    //,中序遍历
    private int cnt = 0;
    private int res;
    public int findKthSmallest(TreeNode root,int k){
        inOrder(root,k);
        return res;
    }

    private void inOrder(TreeNode root, int k) {
        if(root==null)return;
        inOrder(root.left,k);
        cnt++;
        if(cnt==k){
            res = root.val;
            return;
        }
        inOrder(root.right,k);
    }
    //递归解法
    public int findKthSmallest1(TreeNode root,int k){
        int leftCont = helper(root.left);
        if(leftCont==k-1)return root.val;
        if(leftCont>k-1) return findKthSmallest1(root.left,k);
        return findKthSmallest1(root.right,k - leftCont -1);

    }

    private int helper(TreeNode root) {
        if(root==null) return 0;
        return helper(root.left)+helper(root.right)+1;
    }
}
