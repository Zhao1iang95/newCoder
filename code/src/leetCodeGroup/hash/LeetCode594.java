package leetCodeGroup.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 最长和谐子序列
 * @create : 2020/08/04 09:29
 */
public class LeetCode594 {
    //和谐数组是指一个数组里元素的最大值和最小值之间的差别正好是1。
    //
    //现在，给定一个整数数组，你需要在所有可能的子序列中找到最长的和谐子序列的长度。
        public int findLHS(int[] nums){
            Map<Integer,Integer> map = new HashMap<>();
            for (int num:nums) {
                map.put(num,map.getOrDefault(num,0)+1);
            }
            int longest = 0;
            for (int num:map.keySet()) {
                if (map.containsKey(num+1)){
                    longest = Math.max(longest,map.get(num+1))+map.get(num);
                }
            }
            return longest;
        }
}
