package leetCodeGroup.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 最长连续序列
 * @create : 2020/08/04 09:43
 */
public class LeetCode128 {
    //给定一个未排序的整数数组，找出最长连续序列的长度。
    //
    //要求算法的时间复杂度为 O(n)。
    public int longestConsecutive(int [] nums){
        Map<Integer,Integer> map = new HashMap<>();
        for (int num:nums){
            map.put(num,1);
        }
        for(int num : nums){
            forword(map,num);
        }
        return maxCount(map);
    }

    private int maxCount(Map<Integer, Integer> map) {
        int max =0;
        for (int num:map.keySet()) {
            max = Math.max(max,map.get(num));
        }
        return max;
    }

    private int forword(Map<Integer, Integer> map, int num) {
        if(!map.containsKey(num)){
            return 0;
        }
        int cnt = map.get(num);
        if(cnt>1){
            return cnt;
        }
        cnt = forword(map,num+1)+1;
        map.put(num,cnt);
        return cnt;
    }
}
