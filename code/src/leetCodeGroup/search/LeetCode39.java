package leetCodeGroup.search;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 组合求和
 * @create : 2020/09/08 09:32
 */
public class LeetCode39 {
    //给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
    //
    //candidates 中的数字可以无限制重复被选取。
    public List<List<Integer>> combinationSum(int[] candidates,int target){
        List<List<Integer>> combinations = new ArrayList<>();
        dfs(new ArrayList<>(),combinations,0,target,candidates);
        return combinations;
    }

    private void dfs(List<Integer> tempCombination, List<List<Integer>> combinations, int start, int target, int[] candidates) {
        if (target==0){
            combinations.add(new ArrayList<>(tempCombination));
            return;
        }
        for (int i = start; i <candidates.length ; i++) {
            if (candidates[i]<=target){
                tempCombination.add(candidates[i]);
                dfs(tempCombination,combinations,i,target - candidates[i],candidates);
                tempCombination.remove(tempCombination.size()-1);
            }
        }
    }
}
