package HFrequency;


public class NC45 {
    public class TreeNode{
        int val =0;
        TreeNode left = null;
        TreeNode right = null;
    }
    //分别按照二叉树先序，中序和后序打印所有的节点。
    private int preIndex=0,inIndex =0,postIndex =0;
    public int[][] threeOrders(TreeNode root){
        //先序序列，根左右
        int n = count(root);
        int [][] ret = new int[3][n];
        orders(root,ret);
        //中序序列，左根右
        //后序序列，左右根
        return ret;
    }

    private void orders(TreeNode root, int[][] ret) {
        if(root==null)return;
        ret[0][preIndex++] = root.val;
        orders(root.left,ret);
        ret[1][inIndex++] = root.val;
        orders(root.right,ret);
        ret[2][postIndex++]  =root.val;
    }

    private int count(TreeNode root) {
        if(root==null)return 0;
        return 1 + count(root.left) + count(root.right);
    }
}
