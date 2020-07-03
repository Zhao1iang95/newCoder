/**
 * @author zhaoliang
 * @desc 重建二叉树
 * @date 20200427
 */
public class Main4 {
    //输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
    // 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
    // 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
    private int index =0;
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre.length ==0 || in.length == 0)
            return null;
        
        index = 0;
        return solve(pre, in);

    }

    private TreeNode solve(int[] pre, int[] tempIn) {
        int lenLeft = 0;//为了设置左子树长度定义的变量
        for (int i = 0; i < tempIn.length; i++) {
            if (pre[index] == tempIn[i]) {
                break;
            }
            lenLeft++;//左子树节点个数++
        }
        int lenRight = tempIn.length - lenLeft - 1;//为了设置右子树长度定义的变量

        int index1 = 0;
        int index2 = 0;

        int[] temp1 = new int[lenLeft];//左子树数组
        int[] temp2 = new int[lenRight];//右子树数组

        boolean flag = false;

        for (int i = 0; i < tempIn.length; i++) {
            if (pre[index] == tempIn[i]) {
                flag = true;
            } else if (!flag) {
                temp1[index1++] = tempIn[i];
            } else {
                temp2[index2++] = tempIn[i];
            }
        }
        TreeNode node = new TreeNode(pre[index]);
        node.right = null;
        node.left = null;

        if (index < pre.length && temp1.length > 0) {
            index++;
            node.left = solve(pre, temp1);
        }
        if (index < pre.length && temp2.length > 0) {
            index++;
            node.right = solve(pre, temp2);
        }
        return node;
    }
}
