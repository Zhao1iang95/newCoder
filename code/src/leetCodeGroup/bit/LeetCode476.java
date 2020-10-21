package leetCodeGroup.bit;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 数字的补数
 * @create : 2020/08/12 14:25
 */
public class LeetCode476 {
    //给定一个正整数，输出它的补数。补数是对该数的二进制表示取反。
    public int findComplement(int num){
        //题目描述：不考虑二进制表示中的首 0 部分。
        //
        //对于 00000101，要求补码可以将它与 00000111 进行异或操作。那么问题就转换为求掩码 00000111。
        if (num==0)return 1;
        long mask =1;
        while (mask<=num){
            mask = mask<<1;
        }
        mask-=1;
        return (int)mask^num;
    }
}
