/**
 * @desc 二叉搜索树与双向链表
 * @author zhaoliang
 * @date 20200511
 */
public class main26 {
    //输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
    TreeNode head,pre;
    public TreeNode treeToDoublyList(TreeNode pRootOfTree) {
        if(pRootOfTree==null) return null;
        dfs(pRootOfTree);//中序遍历
        head.left = pre;
        pre.right = head;//首尾相连
        return head;
    }
    void dfs(TreeNode cur){
        if(cur==null) return;//
        dfs(cur.left);//左子树
        if(pre!=null){//前驱不为空
            pre.right = cur;//节点移动
        }else{
            head = cur;//当前节点为根节点
        }
        cur.left = pre;//双向链表连接（往左）
        pre = cur;//节点移动
        dfs(cur.right);//遍历右子树
    }
}
