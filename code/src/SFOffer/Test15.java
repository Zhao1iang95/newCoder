package SFOffer;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 二进制中1的个数
 * @create : 2020/09/23 09:15
 */
public class Test15 {
    //输入一个整数，输出该数二进制表示中 1 的个数。
    public int NumberOf1(int n){
        //n&(n-1)
        //该位运算去除 n 的位级表示中最低的那一位。
        int count=0;
        while (n!=0){
            count++;
            n&=(n-1);
        }
        return count;
    }
    public int NumberOf2(int n){
        return Integer.bitCount(n);
    }
}
