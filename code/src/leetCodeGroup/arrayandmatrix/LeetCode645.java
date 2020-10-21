package leetCodeGroup.arrayandmatrix;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 错误的集合
 * @create : 2020/08/06 11:03
 */
public class LeetCode645 {
    public int[] findErrorNums(int []nums){
        for (int i = 0; i <nums.length ; i++) {
            while (nums[i]!=i+1 && nums[nums[i]-1]!=nums[i]){
                swap(nums,i,nums[i]-1);
            }
        }
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]!=i+1){
                return new int[]{nums[i],i+1};
            }
        }
        return null;
    }
    private void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
