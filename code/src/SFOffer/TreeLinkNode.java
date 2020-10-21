package SFOffer;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : TreeLinkNode
 * 在TreeNode的基础上，额外横向增加一个链接节点，数据的序列化格式在TreeNode的基础上，额外增加next节点的数据.
 * @create : 2020/09/22 08:23
 */
public class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;
    TreeLinkNode(int val){
        this.val = val;
    }
}
