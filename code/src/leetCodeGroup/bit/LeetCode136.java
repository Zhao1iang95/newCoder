package leetCodeGroup.bit;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 只出现一次的数字
 * @create : 2020/08/11 09:33
 */
public class LeetCode136 {
    //给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
    //
    //说明：
    //
    //你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？

    public int singleNumber(int[] nums){
        //异或运算不同为1，对每个数进行异或，最后剩下的数就是独立的数
        int ret = 0;
        for (int num:nums) {
            ret = num ^ ret;
        }
        return ret;
    }
}