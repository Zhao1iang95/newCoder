package leetCodeGroup.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 两数之和IV-输入BST
 * @create : 2020/07/28 09:20
 */
public class LeetCode653 {
    //给定一个二叉搜索树和一个目标结果，如果 BST 中存在两个元素且它们的和等于给定的目标结果，则返回 true。
    public boolean findTarget(TreeNode root,int k){
        List<Integer> nums = new ArrayList<>();
        nums =  inOrder(nums,root);
        int i = 0;int j = nums.size()-1;
        while(i<j){
            int sum = nums.get(i)+nums.get(j);
            if(sum == k)return true;
            if(sum>k){
                j--;
            }else {
                i++;
            }
        }
        return false;
    }

    private List<Integer> inOrder(List<Integer> nums, TreeNode root) {
        if(root==null)return nums;
        inOrder(nums,root.left);
        nums.add(root.val);
        inOrder(nums,root.right);
        return nums;
    }
}
