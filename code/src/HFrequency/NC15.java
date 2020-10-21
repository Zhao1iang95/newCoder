package HFrequency;

import java.util.ArrayList;
import java.util.LinkedList;

public class NC15 {
    public class TreeNode{
        int val=0;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    //给定一个二叉树，返回该二叉树层序遍历的结果，（从左到右，一层一层地遍历）
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root){
        if(root==null) return new ArrayList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        stack.addLast(root);
        while(!stack.isEmpty()){
            int size = stack.size();
            ArrayList<Integer> list = new ArrayList<>();
            while(size-- >0){
                TreeNode temp = stack.pollFirst();
                list.add(temp.val);
                if(temp.left!=null){
                    stack.addLast(temp.left);
                }
                if(temp.right!=null){
                    stack.addLast(temp.right);
                }
            }
            res.add(new ArrayList<>(list));
        }
        return res;
    }
}
