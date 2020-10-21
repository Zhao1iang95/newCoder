package leetCodeGroup.greedy;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 非递减数列
 * @create : 2020/08/20 15:30
 */
public class LeetCode665 {
    //给你一个长度为 n 的整数数组，请你判断在 最多 改变 1 个元素的情况下，该数组能否变成一个非递减数列。
    //
    //我们是这样定义一个非递减数列的： 对于数组中所有的 i (0 <= i <= n-2)，总满足 nums[i] <= nums[i + 1]。
    public boolean checkPossibility(int[] nums){
        // 在出现 nums[i] < nums[i - 1] 时，需要考虑的是应该修改数组的哪个数，
        // 使得本次修改能使 i 之前的数组成为非递减数组，并且 不影响后续的操作 。
        // 优先考虑令 nums[i - 1] = nums[i]，因为如果修改 nums[i] = nums[i - 1] 的话，那么 nums[i] 这个数会变大，
        // 就有可能比 nums[i + 1] 大，从而影响了后续操作。还有一个比较特别的情况就是 nums[i] < nums[i - 2]，
        // 修改 nums[i - 1] = nums[i] 不能使数组成为非递减数组，只能修改 nums[i] = nums[i - 1]。
        int cnt =0;
        for (int i = 1; i <nums.length && cnt<2 ; i++) {
            if (nums[i]>=nums[i-1]){
                continue;
            }
            cnt++;
            if (i -2 >=0 && nums[i-2] >nums[i]){
                nums[i] = nums[i-1];
            }else {
                nums[i-1] = nums[i];
            }
        }
        return cnt<=1;
    }
}
