/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 数字在排序数组中出现的次数
 * @create : 2020/05/22 08:56
 */
public class Main37 {
    /**
     * @param nums
     * @param target
     * @return
     * @description 统计一个数字在排序数组中出现的次数。
     */
    public int search(int[] nums, int target) {
        int count = 0;
        for (int num : nums) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }

    //二分查找
    public int search2(int[] nums, int target) {
        return helper(nums, target) - helper(nums, target - 1);
    }

    private int helper(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            int m = (i + j) / 2;
            if (nums[m] <= target) {
                i = m + 1;
            } else {
                j = m - 1;
            }
        }
        return i;
    }

}
