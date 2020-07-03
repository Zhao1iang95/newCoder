/**
 * @desc 斐波那契数列
 * @author zhaoliang
 * @date 20200428
 */
public class Main7 {
    //大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0，第1项是1）。
    //n<=39
    public int Fibonacci(int n) {
        int f0=0;
        int f1=1;
        int ans=0;
        for(int i=0;i<n;i++){
            ans=(f0+f1)% 1000000007;
            f0=f1;
            f1=ans;
        }
        return f0;
    }
}
