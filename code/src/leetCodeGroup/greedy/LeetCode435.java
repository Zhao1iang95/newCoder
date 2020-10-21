package leetCodeGroup.greedy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 无重叠区间
 * @create : 2020/08/19 09:16
 */
public class LeetCode435 {
    //给定一个区间的集合，找到需要移除区间的最小数量，使剩余区间互不重叠。
    //注意:
    //可以认为区间的终点总是大于它的起点。
    //区间 [1,2] 和 [2,3] 的边界相互“接触”，但没有相互重叠。
    public int eraseOverlapIntervals(int[][] intervals){
        //先计算最多能组成的不重叠区间个数，然后用区间总个数减去不重叠区间的个数。
        //在每次选择中，区间的结尾最为重要，选择的区间结尾越小，留给后面的区间的空间越大，那么后面能够选择的区间个数也就越大。
        //按区间的结尾进行排序，每次选择结尾最小，并且和前一个区间不重叠的区间。
        if (intervals.length==0)return 0;
        //终点排序贪心
        Arrays.sort(intervals, Comparator.comparingInt(o->o[1]));
        int cnt = 1;
        int end = intervals[0][1];
        for (int i = 1; i <intervals.length ; i++) {
            if (intervals[i][0] < end){
                continue;
            }
            end = intervals[i][1];
            cnt++;
        }
        return intervals.length - cnt;
    }
}
