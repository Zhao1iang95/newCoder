/**
 * @desc 二叉搜索树的第k大节点
 * @author zhaoliang
 * @date 20200416
 */
public class Main54 {
    //给定一棵二叉搜索树，请找出其中的第k小的结点。例如， （5，3，7，2，4，6，8）    中，
    // 按结点数值大小顺序第三小结点的值为4。

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

}
    private TreeNode ans;
    private int index;
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        index = 1;
        ans = null;
        if (k != 0 && pRoot !=null){
            solve(pRoot,k);
        }
        return ans;
    }

    private void solve(TreeNode pRoot, int k) {

        if (ans == null){
            if (pRoot.left != null){
                solve(pRoot.left,k);
            }
            if (index == k){
                ans = pRoot;
            }
            index++;
            if (pRoot.right != null){
                solve(pRoot.right,k);
            }
        }

    }
}




































