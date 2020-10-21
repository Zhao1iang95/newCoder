package leetCodeGroup.bit;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 汉明距离
 * @create : 2020/08/11 09:13
 */
public class LeetCode461 {
    //两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
    //
    //给出两个整数 x 和 y，计算它们之间的汉明距离。
    //
    //注意：
    //0 ≤ x, y < 231.
    public int hammingDistance1(int x,int y){
        int z = x ^ y;
        int count =0;
        while(z!=0){
            if((z&1)==1){
                count++;
            }
            z = z>>1;
        }
        return count;
    }
    public int hammingDistance2(int x,int y){
        return Integer.bitCount(x ^ y);
    }
    public int hammingDistance3(int x,int y){
        int z = x ^ y;
        int cnt = 0;
        while (z!=0){
            z &=(z-1);
            cnt++;
        }
        return cnt;
    }
}
