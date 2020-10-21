package SFOffer;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 圆圈中最后剩下的数
 * @create : 2020/10/06 08:16
 */
public class Test62 {
    //约瑟夫环，圆圈长度为 n 的解可以看成长度为 n-1 的解再加上报数的长度 m。因为是圆圈，所以最后需要对 n 取余。
    public int LastRemaining(int n,int m){
        if (n==0)return -1;
        if (n==1)return 0;
        return (LastRemaining(n-1,m)+m)%n;
    }
    public int LastRemaining1(int n,int m){
        if(n<=0)return -1;
        int s = 0;
        for (int i = 2; i <=n ; i++) {
            s=(s+m)%i;
        }
        return s;
    }
}
