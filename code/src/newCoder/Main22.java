import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author zhaoliang
 * @desc 从上到下打印二叉树
 * @date 20200507
 */
public class Main22 {
    //从上往下打印出二叉树的每个节点，同层节点从左至右打印。
    public int[] levelOrder(TreeNode root) {
        if (root == null)
            return new int[0];
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            ans.add(node.val);
            if (node.left != null)
                queue.add(node.left);
            if (node.right != null)
                queue.add(node.right);

        }
        int[] a = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            a[i] = ans.get(i);
        }
        return a;
    }
}
