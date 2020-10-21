package leetCodeGroup.tree;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 从有序数组中构造二叉树
 * @create : 2020/07/28 08:45
 */
public class LeetCode108 {
    public TreeNode sortedArrayToBST(int[] nums){
        return toBST(nums,0,nums.length-1);
    }

    private TreeNode toBST(int[] nums, int start, int end) {
        if(start>end)return null;
        int mid = (start+end)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = toBST(nums,start,mid-1);
        root.right = toBST(nums,mid+1,end);
        return root;
    }

}
