package leetCodeGroup.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : N叉树的后序遍历
 * @create : 2020/07/17 10:34
 */
class Node{
    public int val;
    public List<Node> children;
    public Node(){}
    public Node(int x){
        val = x;
    }
    public Node(int x,List<Node> _children){
        val = x;
        children = _children;
    }
}
public class LeetCode590 {
    //给定一个 N 叉树，返回其节点值的后序遍历。
    //递归
    public List<Integer> postorder(Node root){
        List<Integer> res = new ArrayList<>();
        return helper(root,res);
    }

    private List<Integer> helper(Node root, List<Integer> res) {
        if (root==null)return res;
        int s = root.children.size();
        for (int i = 0; i <s ; i++) {
            helper(root.children.get(i),res);
        }
        res.add(root.val);
        return res;
    }
    //迭代
    private LinkedList<Integer> res = new LinkedList<>();
    public List<Integer> postorder1(Node root) {
        if(root==null)return res;
        LinkedList<Node> list = new LinkedList<>();
        list.add(root);
        while(!list.isEmpty()){
            Node node = list.pollLast();
            res.addFirst(node.val);
            for(int i=0;i<node.children.size();i++){
                list.add(node.children.get(i));
            }
        }
        return res;
    }
}
