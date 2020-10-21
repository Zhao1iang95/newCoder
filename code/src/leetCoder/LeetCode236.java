package leetCoder;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 二叉树的最低公共祖先
 * @create : 2020/07/12 14:05
 */
public class LeetCode236 {
    //给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
    //递归
    public TreeNode lowestCommentAncestor(TreeNode root, TreeNode p, TreeNode q){
        //迭代
//        if(p.val>q.val){
//            TreeNode temp = p;
//            p = q;
//            q = temp;
//        }
//        while(root!=null){
//            if(root.val>q.val){
//                root = root.left;
//            }else if(root.val<p.val){
//                root = root.right;
//            }else{
//                break;
//            }
//        }
//        return root;
        //递归
       if(root.val>p.val && root.val>q.val){
           return lowestCommentAncestor(root.left,p,q);
       }else if(root.val<p.val && root.val<q.val){
           return lowestCommentAncestor(root.right,p,q);
       }
       return root;
    }
}
