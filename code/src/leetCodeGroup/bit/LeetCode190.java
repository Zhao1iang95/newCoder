package leetCodeGroup.bit;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 颠倒二进制位
 * @create : 2020/08/11 14:55
 */
public class LeetCode190 {
    //颠倒给定的 32 位无符号整数的二进制位。
    public int reverseBits(int n){
        int ret=0;
        for (int i = 0; i < 32; i++) {
            ret<<=1;
            ret|=(n&1);
            n>>>=1;
        }
        return ret;
    }
    //不用第三个变量交换两个整数
    public static void main(String[] args) {
        int a=3;
        int b=4;
        a = a^b;
        b= a^b;
        a = a^b;
        System.out.println(a+"-"+b);
    }
}
