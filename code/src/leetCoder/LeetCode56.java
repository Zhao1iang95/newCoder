package leetCoder;

import java.util.Arrays;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 合并区间
 * @create : 2020/06/19 09:01
 */
public class LeetCode56 {
    //给出一个区间的集合，请合并所有重叠的区间。
    public int[][] merge(int[][] intervals) {
        //先按照区间的起始位置排序
        Arrays.sort(intervals,(v1,v2)->v1[0]-v2[0]);
        //遍历区间
        int[][] res = new int[intervals.length][2];
        int idx = -1;
        for (int[] interval:intervals) {
            //如果数组是空的，或者当前数组的起始位置>结果数组中最后区域的起始位置
            //则不合并，直接将数组插入到结果集中
            if (idx==-1 || interval[0] > res[idx][1]){
                res[++idx] = interval;
            }else {
                //反之将当前区间合并至结果数组的最后区间
                res[idx][1] = Math.max(res[idx][1],interval[1]);
            }
        }
        return Arrays.copyOf(res,idx+1);
    }
}
