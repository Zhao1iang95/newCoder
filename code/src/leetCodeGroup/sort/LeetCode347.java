package leetCodeGroup.sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 前K个高频元素
 * @create : 2020/08/17 10:09
 */
public class LeetCode347 {
    //给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
    public static int[] topKFrequent(int[] nums,int k){
        List<Integer> res = new ArrayList<>();
        //使用字典，统计每个元素出现的次数，元素为键，元素出现的次数为值
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num:nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        //桶排序
        //将频率作为数组下标，对于出现频率不同的数字集合，存入对应的数组下标
        List<Integer>[] list = new List[nums.length+1];
        for (int key:map.keySet()) {
            int i = map.get(key);
           if (list[i]==null){
              list[i] = new ArrayList<>();
           }
           list[i].add(key);
        }
        //倒序遍历数组获取出现顺序从大到小的排列
        for (int i = list.length-1; i >0 && res.size()<k ; i--) {
            if (list[i]==null)continue;
            res.addAll(list[i]);
        }
        int [] a = new int[k];
        for (int i = 0; i <res.size() ; i++) {
            a[i] = res.get(i);
        }
        return a;
    }

    public static void main(String[] args) {
        int[] nums =  new int[]{1,1,1,2,2,3};
        int k = 2;
        topKFrequent(nums,k);

    }
}
