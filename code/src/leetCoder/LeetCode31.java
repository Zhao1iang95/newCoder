package leetCoder;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 下一个排列
 * @create : 2020/06/11 09:17
 */
public class LeetCode31 {
    //实现获取下一个排列的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。
    //
    //如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
    //
    //必须原地修改，只允许使用额外常数空间
    public void nextPermutation(int[] nums) {
        int i = nums.length-2;
        while (i>=0 && nums[i+1] <=nums[i]){
            i--;
        }
        if (i >=0){
            int j = nums.length -1;
            while (j>=0 && nums[j] <= nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1);
    }

    private void reverse(int[] nums, int start) {
        int i = start,j = nums.length -1;
        while (i < j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
