package leetCodeGroup.dp;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 区域和检索-数组不可变
 * @create : 2020/09/11 09:09
 */
public class LeetCode303 {
    //给定一个整数数组  nums，求出数组从索引 i 到 j  (i ≤ j) 范围内元素的总和，包含 i,  j 两点。
    private int[] sums;
    public LeetCode303(int[] nums){
        sums = new int[nums.length+1];
        for (int i = 1; i <=nums.length ; i++) {
            sums[i] = sums[i-1]+nums[i-1];
        }
    }
    public int sumRange(int i,int j){
        return sums[j+1] - sums[i];
    }
}
