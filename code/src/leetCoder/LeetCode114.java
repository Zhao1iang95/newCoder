package leetCoder;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 二叉树展开为链表
 * @create : 2020/06/28 08:45
 */
public class LeetCode114 {
    //给定一个二叉树，原地将它展开为一个单链表。
    public void flatten(TreeNode root){
        while (root!=null){
            if (root.left==null){
                root = root.right;
            }else {
                TreeNode pre = root.left;
                while (pre.right!=null){
                    pre = pre.right;
                }
                pre.right = root.right;
                root.right = root.left;
                root.left = null;
                root = root.right;
            }
        }
    }
}
