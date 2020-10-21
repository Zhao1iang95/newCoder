package leetCodeGroup.search;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 分割回文串
 * @create : 2020/09/09 08:35
 */
public class LeetCode131 {
    //给定一个字符串 s，将 s 分割成一些子串，使每个子串都是回文串。
    //返回 s 所有可能的分割方案。

    public List<List<String>> partition(String s){
        List<List<String>> res = new ArrayList<>();
        List<String> tempList = new ArrayList<>();
        dfs(s,res,tempList);
        return res;
    }

    private void dfs(String s, List<List<String>> res, List<String> tempList) {
        if (s.length() ==0){
            res.add(new ArrayList<>(tempList));
            return;
        }
        for (int i = 0; i <s.length() ; i++) {
            if(isPalindrome(s,0,i)){
                tempList.add(s.substring(0,i+1));
                dfs(s.substring(i+1),res,tempList);
                tempList.remove(tempList.size()-1);
            }
        }
    }

    private boolean isPalindrome(String s, int begin, int end) {
        while (begin<end){
            if (s.charAt(begin++)!=s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}
