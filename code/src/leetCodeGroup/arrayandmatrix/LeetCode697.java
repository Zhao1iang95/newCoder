package leetCodeGroup.arrayandmatrix;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 数组的度
 * @create : 2020/08/07 10:47
 */
public class LeetCode697 {
    //给定一个非空且只包含非负数的整数数组 nums, 数组的度的定义是指数组里任一元素出现频数的最大值。
    //
    //你的任务是找到与 nums 拥有相同大小的度的最短连续子数组，返回其长度。
    public int findShortestSubArray(int[] nums){
        Map<Integer,Integer> numsCnt = new HashMap<>();
        Map<Integer,Integer> numsLastIndex = new HashMap<>();
        Map<Integer,Integer> numsFirstIndex = new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            int num = nums[i];
            numsCnt.put(num,numsCnt.getOrDefault(num,0)+1);
            numsLastIndex.put(num,i);
            if(!numsFirstIndex.containsKey(num)) {
                numsFirstIndex.put(num, i);
            }
        }
        int maxCnt = 0;
        for (int num : nums){
            maxCnt = Math.max(maxCnt,numsCnt.get(num));
        }
        int ret = nums.length;
        for (int i = 0; i <nums.length ; i++) {
            int num = nums[i];
            int cnt = numsCnt.get(num);
            if(cnt!=maxCnt)continue;
            ret = Math.min(ret,numsLastIndex.get(num)-numsFirstIndex.get(num)+1);
        }
        return ret;
    }
}
