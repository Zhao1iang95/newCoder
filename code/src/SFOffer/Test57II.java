package SFOffer;

import java.util.ArrayList;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 和为S的连续正数序列
 * @create : 2020/10/05 08:34
 */
public class Test57II {
    //输出所有和为 S 的连续正数序列。
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum){
        ArrayList<ArrayList<Integer>> ret =new ArrayList<>();
        int start = 1,end =2,curSum = 3;
        while (end <sum){
            if (curSum > sum){
                curSum -=start;
                start++;
            }else if(curSum < sum){
                end++;
                curSum += end;
            }else {
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = start; i <= end; i++) {
                    list.add(i);
                }
                ret.add(list);
                curSum -= start;
                start++;
                end++;
                curSum += end;
            }
        }
        return ret;
    }
}
