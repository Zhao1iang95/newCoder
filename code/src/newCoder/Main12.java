/**
 * @author zhaoliang
 * @desc 数值的整数次方
 * @date 20200429
 */
public class Main12 {
    //leetcode超时
    public double Power(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (exponent == 1) {
            return base;
        }
        double ans = 1.0;
        if (exponent >= 0)
            for (int i = 0; i < exponent; i++) {
                ans = ans * base;
            }
        if (exponent < 0) {
            for (int i = exponent; i < 0; i++) {
                ans = ans * base;
            }
            ans = 1 / ans;
        }
        return ans;
    }

    public double myPow(double x, int n) {
        if(x==0){
            return 0;
        }
        long b = n;
        if(b<0){
            x = 1/x;
            b=-b;
        }
        double ans = 1.0;
        while(b>0){
            if((b & 1)==1){//当循环执行到最后一步，b等1时，做统计，计算ans
                ans *=x;
            }
            x*=x;
            b>>=1;
        }
        return ans;
    }
}
