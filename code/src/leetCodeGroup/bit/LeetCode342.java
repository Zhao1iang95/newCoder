package leetCodeGroup.bit;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 4的幂
 * @create : 2020/08/12 14:14
 */
public class LeetCode342 {
    // 给定一个整数 (32 位有符号整数)，请编写一个函数来判断它是否是 4 的幂次方。
    public boolean isPowerOfFour(int num){
        //这种数在二进制表示中有且只有一个奇数位为 1，例如 16（10000）。
        return num>0 && (num & (num-1))==0 && (num & 0b01010101010101010101010101010101)!=0;
    }
}
