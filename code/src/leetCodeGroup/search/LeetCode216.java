package leetCodeGroup.search;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 组合总数III
 * @create : 2020/09/08 10:02
 */
public class LeetCode216 {
    public List<List<Integer>> combinationSum3(int k,int n){
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> combinaList = new ArrayList<>();
        dfs(combinaList,res,1,k,n);
        return res;
    }

    private void dfs(List<Integer> combinaList, List<List<Integer>> res, int start, int k, int n) {
        if (k ==0 && n ==0){
            res.add(new ArrayList<>(combinaList));
            return;
        }
        if (k==0 || n ==0){
            return;
        }
        for (int i = start; i <=9 ; i++) {
            combinaList.add(i);
            dfs(combinaList,res,i+1,k-1,n-i);
            combinaList.remove(combinaList.size()-1);
        }
    }
}
