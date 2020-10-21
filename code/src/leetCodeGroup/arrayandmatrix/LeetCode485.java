package leetCodeGroup.arrayandmatrix;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 最大连续1的个数
 * @create : 2020/08/06 10:06
 */
public class LeetCode485 {
    //给定一个二进制数组， 计算其中最大连续1的个数。
    public int findMaxConsecutiveOnes(int[] nums){
        int max=0,cur=0;
        for (int x:nums){
            cur =x ==0?0:cur+1;
            max = Math.max(max,cur);
        }
        return max;
    }
}
