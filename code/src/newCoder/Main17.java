/**
 * @author zhaoliang
 * @desc 树的子结构
 * @date 20200505
 */
public class Main17 {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        //树1树2都不为空，遍历，判断。
        return ((root1 !=null && root2 !=null) && (dfs(root1,root2) || HasSubtree(root1.left,root2) || HasSubtree(root1.right,root2)) );
    }

    private boolean dfs(TreeNode root1, TreeNode root2) {
        if (root2 == null) return true;
        if (root1 == null || root2.val !=root1.val) return false;
        return dfs(root1.left,root2.left) && dfs(root1.right,root2.right);
    }
}
