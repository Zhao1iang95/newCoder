package SFOffer;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 数值的整数次方
 * @create : 2020/09/23 09:22
 */
public class Test16 {
    //给定一个 double 类型的浮点数 base 和 int 类型的整数 exponent，求 base 的 exponent 次方。
    public double Power(double base,int exponent){
        if (exponent ==0)return 1;
        if (exponent ==1)return base;
        boolean isNaN = false;
        if (exponent <0){
            exponent =-exponent;
            isNaN = true;
        }
        double pow = Math.pow(base*base,exponent/2);
        if (exponent %2!=0){
            pow = pow*base;
        }
        return isNaN?1/pow:pow;
    }
}
