package leetCodeGroup.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 二叉树的所有路径
 * @create : 2020/07/20 09:55
 */
public class LeetCode257 {
    //给定一个二叉树，返回所有从根节点到叶子节点的路径。

    public List<String> binaryTreePaths(TreeNode root){
        List<String> res = new ArrayList<>();
        return helper(root,res,"");
    }

    private List<String> helper(TreeNode root, List<String> res,String path) {
        if(root!=null){
            path+=Integer.toString(root.val);
            if(root.left==null && root.right==null){
                res.add(path);
            }else {
                path+="->";
                helper(root.left,res,path);
                helper(root.right,res,path);
            }
        }
        return res;
    }
}
