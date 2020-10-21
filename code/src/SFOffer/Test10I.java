package SFOffer;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 斐波那契数列
 * @create : 2020/09/22 10:11
 */
public class Test10I {
    //大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0，第1项是1）。
    //n<=39
    public int Fibonacci1(int n){
        if(n <=1){
            return n;
        }
        int[] fib = new int[n+1];
        fib[1] = 1;
        for (int i = 2; i <=n ; i++) {
            fib[i] = fib[i-1]+fib[i-2];
        }
        return fib[n];
    }
    public int Fibonacci2(int n){
        if(n <=1){
            return n;
        }
        int f1=0,f2=1;
        int fib = 0;
        for (int i = 2; i <=n ; i++) {
            fib = f1+f2;
            f1 = f2;
            f2 = fib;
        }
        return fib;
    }
}
