package leetCoder;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 搜索旋转排序数组
 * @create : 2020/06/13 10:06
 */
public class LeetCode33 {
    //假设按照升序排序的数组在预先未知的某个点上进行了旋转。
    //
    //( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
    //
    //搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。
    //
    //你可以假设数组中不存在重复的元素。
    //
    //你的算法时间复杂度必须是 O(log n) 级别
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0){
            return -1;
        }
        int start = 0;
        int end = nums.length -1;
        int mid;
        while (start <=end){
            mid = start + (end - start)/2;
            if (nums[mid] == target){
                return mid;
            }
            //前半部分有序，注意用小于等于
            if (nums[start] <= nums[mid]){
                //target   在前半部分
                if (target >= nums[start] && target <nums[mid]){
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            }else {
                if (target<=nums[end] && target > nums[mid]){
                    start = mid +1;
                }else {
                    end = mid -1;
                }
            }
        }
        return -1;
    }
}