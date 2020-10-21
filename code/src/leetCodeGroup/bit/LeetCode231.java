package leetCodeGroup.bit;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 2的幂
 * @create : 2020/08/11 15:10
 */
public class LeetCode231 {
    public boolean isPowerOfTwo(int n){
        //二进制表示只有一个 1 存在
//        return n>0 && Integer.bitCount(n)==1;
        //&，都是1为1
        //利用 1000 & 0111 == 0 这种性质，得到以下解法：
        return n >0 && (n&(n-1))==0;
    }
}
