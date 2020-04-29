/**
 * @author zhaoliang
 * @desc 变态跳台阶
 * @date 20200428
 */
public class Main9 {
    //一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
    public int JumpFloorII(int target) {
        if (target == 1) {
            return 1;
        }
        int sum = 1;
        int[] a = new int[target + 1];
        for (int i = 2; i < target; i++) {
            a[i] = sum + 1;
            sum = sum + a[i];
        }
        return a[target];
    }
}
