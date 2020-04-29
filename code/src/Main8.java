/**
 * @desc 青蛙跳台阶
 * @author zhaoliang
 * @date 20200428
 */
public class Main8 {
    //一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
    public int JumpFloor(int n) {
        int f1=1;
        int f2=2;
        int ans=0;
        for(int i=1;i<n;i++){
            ans=(f1+f2)% 1000000007;
            f1=f2;
            f2=ans;
        }
        return f1;
    }
}
