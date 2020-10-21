package leetCodeGroup.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 组合总数II
 * @create : 2020/09/08 09:47
 */
public class LeetCode40 {
    //给定一个数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
    //
    //candidates 中的每个数字在每个组合中只能使用一次。
    public List<List<Integer>> combinationSum2(int[] candidates, int target){
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> combinaList = new ArrayList<>();
        Arrays.sort(candidates);
        boolean[] hasVisited = new boolean[candidates.length];
        dfs(combinaList,res,hasVisited,0,target,candidates);
        return res;
    }

    private void dfs(List<Integer> combinaList, List<List<Integer>> res, boolean[] hasVisited, int start, int target, int[] candidates) {
        if (target == 0){
            res.add(new ArrayList<>(combinaList));
            return;
        }
        for (int i = start; i <candidates.length ; i++) {
            if (i!=0 && candidates[i] == candidates[i-1] && !hasVisited[i-1]){
                continue;
            }
            if (candidates[i] <= target){
                combinaList.add(candidates[i]);
                hasVisited[i] = true;
                dfs(combinaList,res,hasVisited,i+1,target-candidates[i],candidates);
                hasVisited[i] = false;
                combinaList.remove(combinaList.size()-1);
            }
        }
    }

}
