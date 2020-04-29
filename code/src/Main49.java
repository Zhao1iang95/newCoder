/**
 * @desc 丑数
 * @author zhaoliang
 * @date 20200414
 */
public class Main49 {
    //把只包含质因子2、3和5的数称作丑数（Ugly Number）。
    // 例如6、8都是丑数，但14不是，因为它包含质因子7。
    // 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。

    public int GetUglyNumber_Solution(int index) {
        if (index == 0){
            return 0;
        }
       int[] a = new int[index];
       a[0] = 1;
       int index1 = 0;//遍历丑数*2的序列
       int index2 = 0;//遍历丑数*3的序列
       int index3 = 0;//遍历丑数*5的序列
        for (int i = 1; i < index;i++){
            a[i] = Math.min(Math.min(a[index1] * 2,a[index2] * 3),a[index3] * 5);
            //根据放在第i个位置上的数字更新遍历三个队列的下标
            if (a[i] == a[index1] * 2){
                index1++;
            }
            if (a[i] == a[index2] * 3){
                index2++;
            }
            if (a[i] == a[index3] * 5){
                index3++;
            }
        }
        return a[index - 1];
    }
}































































































































