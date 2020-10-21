package leetCodeGroup.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 全排列II
 * @create : 2020/09/08 08:36
 */
public class LeetCode47 {
    //给定一个可包含重复数字的序列，返回所有不重复的全排列。
    public List<List<Integer>> permuteUnique(int[] nums){
        List<List<Integer>> permutes = new ArrayList<>();
        List<Integer> permuteList= new ArrayList<>();
        Arrays.sort(nums);
        boolean[] hasVisited = new boolean[nums.length];
        dfs(permuteList,permutes,hasVisited,nums);
        return permutes;
    }

    private void dfs(List<Integer> permuteList, List<List<Integer>> permutes, boolean[] hasVisited, int[] nums) {
        if (permuteList.size() == nums.length){
            permutes.add(permuteList);
            return;
        }
        for (int i = 0; i <hasVisited.length ; i++) {
            if (i!=0 && nums[i] == nums[i-1] && !hasVisited[i-1]){
                continue;//防止重复
            }
            if (hasVisited[i]){
                continue;
            }
            hasVisited[i] = true;
            permuteList.add(nums[i]);
            dfs(permuteList,permutes,hasVisited,nums);
            permuteList.remove(permuteList.size()-1);
            hasVisited[i] = false;
        }
    }
}
