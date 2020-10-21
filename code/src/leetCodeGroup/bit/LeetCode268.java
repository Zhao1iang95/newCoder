package leetCodeGroup.bit;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 缺失数字
 * @create : 2020/08/11 09:45
 */
public class LeetCode268 {
    //给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
    public int missingNumber(int[] nums){
        //1，每个数异或自己等于0
        //2，每个数异或0等于自己
        //3，异或的交换律
        //根据题意只需要把数组的每个数和完整的0～n进行异或，得到的就是缺失的数
        int ret =0;
        for (int i = 0; i <nums.length ; i++) {
            ret = ret ^ i ^ nums[i];
        }
        return ret ^ nums.length;
    }
}
