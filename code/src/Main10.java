/**
 * @desc 矩阵覆盖
 * @author zhaoliang
 * @date 20200428
 */
public class Main10 {
    //我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
    public int RectCover(int target) {
        int f1=1;
        int f2=2;
        int sum =0;
        for (int i=0;i<target;i++){
            sum = f1+f2;
            f1=f2;
            f2=sum;
        }
        return sum;
    }
}
