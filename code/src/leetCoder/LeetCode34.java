package leetCoder;
/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 在排序数组中查找元素的第一个和最后一个位置
 * @create : 2020/06/15 09:24
 */
public class LeetCode34 {
    //给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
    //
    //你的算法时间复杂度必须是 O(log n) 级别。
    //
    //如果数组中不存在目标值，返回 [-1, -1]。
    public int[] searchRange(int[] nums, int target) {
        int end = nums.length-1;
        int[] res =new int[]{-1, -1};
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]== target && res[0]==-1){
                res[0] =i;
            }
            if (nums[end] == target && res[1] ==-1){
                res[1] = end;
            }
            end--;
        }
        return res;
    }
}
