package SFOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 从上往下打印二叉树
 * @create : 2020/09/28 08:06
 */
public class Test32I {
    //从上往下打印出二叉树的每个节点，同层节点从左至右打印。
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> ret = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int cnt = queue.size();
            while(cnt-- >0){
                TreeNode t = queue.poll();
                if (t==null)continue;
                ret.add(t.val);
                queue.add(t.left);
                queue.add(t.right);
            }
        }
        return ret;
    }
}
