package SFOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 把二叉树打印多行
 * @create : 2020/09/28 08:18
 */
public class Test32II {
    //从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot){
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        while (!queue.isEmpty()){
            ArrayList<Integer> list = new ArrayList<>();
            int cnt = queue.size();
            while(cnt-- >0){
                TreeNode t = queue.poll();
                if(t == null){
                    continue;
                }
                list.add(t.val);
                queue.add(t.left);
                queue.add(t.right);
            }
            if (list.size()!=0){
                ret.add(list);
            }
        }
        return ret;
    }
}
