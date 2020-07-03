/**
 * @desc 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 * @author zhaoliang
 * @date 20200422
 */
public class Main64 {
    //求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
//    public int Sum_Solution(int n) {
//        return ((int)Math.pow(n,2) + n) >>1;
//    }
    public int Sum_Solution(int n) {
        int sum = n;
        boolean flag = (n > 0) && (sum += Sum_Solution(n - 1)) >0;
        return sum;
    }
}
