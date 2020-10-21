package leetCodeGroup.bit;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 只出现一次的数字III
 * @create : 2020/08/11 09:53
 */
public class LeetCode260 {
    //给定一个整数数组 nums，其中恰好有两个元素只出现一次，其余所有元素均出现两次。 找出只出现一次的那两个元素。
    public int[] singleNumber(int[] nums){
        int diff = 0;
        for(int  num:nums){
            diff = diff ^ num;
        }
        diff&=-diff;//得到最右一位
        int[] ret = new int[2];
        for(int num:nums){
            if((num&diff)==0){
                ret[0]^=num;
            }else {
                ret[1]^=num;
            }
        }
        return ret;
    }
}
