package leetCodeGroup.bit;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 两整数之和
 * @create : 2020/08/12 14:40
 */
public class LeetCode371 {
    //不使用运算符 + 和 - ​​​​​​​，计算两整数 ​​​​​​​a 、b ​​​​​​​之和。
    //a ^ b 表示没有考虑进位的情况下两数的和，(a & b) << 1 就是进位。
    //
    //递归会终止的原因是 (a & b) << 1 最右边会多一个 0，那么继续递归，进位最右边的 0 会慢慢增多，最后进位会变为 0，递归终止。
    public int getSum(int a,int b){
        return b==0?1:getSum((a^b),(a&b)<<1);
    }
}
