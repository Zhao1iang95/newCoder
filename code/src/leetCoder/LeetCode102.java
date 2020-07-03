package leetCoder;

import java.util.*;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 二叉树的层序遍历
 * @create : 2020/06/26 18:41
 */
public class LeetCode102 {
    //给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
    public List<List<Integer>> levelOrder(TreeNode treeNode){
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(treeNode);
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new LinkedList<>();
            for (int i = 0; i <size ; i++) {
                TreeNode cur = queue.peek();
                queue.poll();
                if (cur==null){
                    continue;
                }
                list.add(cur.val);
                queue.offer(cur.left);
                queue.offer(cur.right);
            }
            if (!list.isEmpty()){
                res.add(list);
            }
        }
        return res;
    }
}
