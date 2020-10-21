package leetCodeGroup.bit;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 交替位二进制数
 * @create : 2020/08/12 14:21
 */
public class LeetCode693 {
    //给定一个正整数，检查他是否为交替位二进制数：换句话说，就是他的二进制数相邻的两个位数永不相等
    //对于 1010 这种位级表示的数，把它向右移动 1 位得到 101，这两个数每个位都不同，因此异或得到的结果为 1111。
    public boolean hasAlternatingBits(int num){
        int a = (num ^ (num>>1));
        return (a & (a+1)) ==0;
    }
}
