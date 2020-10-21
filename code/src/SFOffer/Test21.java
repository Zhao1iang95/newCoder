package SFOffer;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 调整数组顺序使奇数位于偶数前面
 * @create : 2020/09/25 08:57
 */
public class Test21 {
    //输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
    // 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
    public void reOrderArray(int[] array){
        //奇数个数
        int oddCnt = 0;
        for (int x:array
             ) {
            if (!isEven(x)){
                oddCnt++;
            }
        }
        int [] copy = array.clone();
        int i=0,j=oddCnt;
        for (int num:copy
             ) {
            if (num % 2==1){
                array[i++] = num;
            }else {
                array[j++] = num;
            }
        }
    }

    private boolean isEven(int x) {
        return x %2==0;
    }
}
