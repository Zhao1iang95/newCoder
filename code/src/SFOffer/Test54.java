package SFOffer;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 二叉查找树的第K个节点
 * @create : 2020/10/04 09:28
 */
public class Test54 {
    //给定一棵二叉搜索树，请找出其中的第k小的结点。例如， （5，3，7，2，4，6，8) 中，
    //按结点数值大小顺序第三小结点的值为4。
    private TreeNode ret;
    private int cnt = 0;
    TreeNode KthNode(TreeNode pRoot,int k){
        //利用二叉查找树中序遍历有序的特点。
        inOrder(pRoot,k);
        return ret;
    }

    private void inOrder(TreeNode pRoot, int k) {
        if (pRoot==null || cnt >= k){
            return;
        }
        inOrder(pRoot.left,k);
        cnt++;
        if (cnt == k){
            ret = pRoot;
        }
        inOrder(pRoot.right,k);
    }
}
