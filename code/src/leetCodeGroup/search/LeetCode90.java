package leetCodeGroup.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 子集II
 * @create : 2020/09/09 08:21
 */
public class LeetCode90 {
    //给定一个可能包含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
    //
    //说明：解集不能包含重复的子集。
    public List<List<Integer>> subsetsWithDup(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        boolean[] hasVisited = new boolean[nums.length];
        for (int size = 0; size <=nums.length ; size++) {
            dfs(0,res,tempList,hasVisited,size,nums);
        }
        return res;
    }

    private void dfs(int start, List<List<Integer>> res, List<Integer> tempList, boolean[] hasVisited, int size, int[] nums) {
        if (tempList.size() == size){
            res.add(new ArrayList<>(tempList));
            return;
        }
        for (int i = start; i <nums.length ; i++) {
            if(i!=0 && nums[i] == nums[i-1] && !hasVisited[i-1]){
                continue;
            }
            tempList.add(nums[i]);
            hasVisited[i] = true;
            dfs(i+1,res,tempList,hasVisited,size,nums);
            hasVisited[i] = false;
            tempList.remove(tempList.size()-1);
        }
    }
}
