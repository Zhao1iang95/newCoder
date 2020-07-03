/**
 * @desc 圆圈的最后一个数字
 * @author zhaoliang
 * @date 20200421
 */
public class Main62 {
    //0,1,,n-1这n个数字排成一个圆圈，从数字0开始，
    // 每次从这个圆圈里删除第m个数字。求出这个圆圈里剩下的最后一个数字。
    //例如，0、1、2、3、4这5个数字组成一个圆圈，
    // 从数字0开始每次删除第3个数字，则删除的前4个数字依次是2、0、4、1，因此最后剩下的数字是3
    //过不了leetcode的时间限制
    public int LastRemaining_Solution(int n, int m) {
        if (n == 0 || m == 0){
            return -1;
        }
        boolean[] vis = new boolean[n];//代表第i个小朋友移除圆桌，vis[i] = true

        int sum  = 0;//用来几率当前已经移除的元素综合

        int res = 0;//用来记录每一次循环的过程中已经计数的个数

        int index = 0;

        while (sum < n - 1){
            res = 0;

            while (vis[index]){//已经移除的跳过
                index = (index + 1) %n;
            }

            while (res < m){//找第m个位置
                if (!vis[index]){
                    res++;
                }
                index = (index + 1) %n;
            }
            vis[(index + n - 1) % n] = true;//标记当前移除的元素
            sum++;
        }
        while (vis[index]){//返回之前移除标记过的元素
            index = (index + 1) %n;
        }
        return index;
    }
    //方法二
    public int lastRemaining(int n, int m) {
        if(n == 0 || m==0){
            return -1;
        }
        int ans = 0;
        for (int i = 2 ;i <= n ;i++){
            ans = (ans +m) % i;
        }
        return ans;
    }
}
