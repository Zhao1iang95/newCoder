import java.util.ArrayList;

/**
 * @desc 滑动窗口的最大值
 * @author zhaoliang
 * @date 20200420
 */
public class Main59 {
    //给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
    // 例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，
    // 那么一共存在6个滑动窗口，他们的最大值分别为{4,4,6,6,6,5}；
    // 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个：
    // {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}，
    // {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> ans =new ArrayList<>();
        if (num.length == 0 || size == 0 || size > num.length){
            return ans;
        }
//        int index = 0;
        int Max = Integer.MIN_VALUE;
        int pos = -1;
        for (int i = 0; i < size ; i++){
            if (num[i] > Max){
                Max = num[i];
                pos = i;
            }
        }
        ans.add(Max);
        for (int i = size;i<= num.length - 1; i++){//i-->窗口的右区间
            if (i - size + 1 <= pos ){
                if (num[i] >Max){
                    Max = num[i];
                    pos = i;
                }
            }else {
                Max = Integer.MIN_VALUE;
                for (int j = i - size + 1; j <=i;j++){
                    if (num[j] > Max){
                        Max = num[j];
                        pos = j;
                    }
                }
            }
            ans.add(Max);
        }
        return ans;
    }
}
