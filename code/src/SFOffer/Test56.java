package SFOffer;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 数组中只出现一次的数字
 * @create : 2020/10/05 08:18
 */
public class Test56 {
    public void FindNumsAppearOnce(int[] array,int num1[],int num2[]){
    //一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
    int diff = 0;
        for (int num:array) {
            diff^=num;//循环结果为两个只出现一次的数字的异或
        }
        diff&=-diff;
        //diff &= -diff 得到出 diff 最右侧不为 0 的位，也就是不存在重复的两个元素在位级表示上最右侧不同的那一位，利用这一位就可以将两个元素区分开来。
        for (int num:array
             ) {
            if ((num&diff) == 0){
                num1[0] ^= num;
            }else {
                num2[0] ^=num;
            }
        }
    }
}
