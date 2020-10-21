package SFOffer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 按之字形打印二叉树
 * @create : 2020/09/28 08:44
 */
public class Test32III {
    //请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot){
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        boolean reverse = false;
        while (!queue.isEmpty()){
            ArrayList<Integer> list = new ArrayList<>();
            int cnt = queue.size();
            while (cnt-- >0){
                TreeNode t = queue.poll();
                if (t == null)continue;
                list.add(t.val);
                queue.add(t.left);
                queue.add(t.right);
            }
            if (reverse){
                Collections.reverse(list);
            }
            reverse = !reverse;
            if (list.size()!=0){
                ret.add(list);
            }
        }
        return ret;
    }
}
