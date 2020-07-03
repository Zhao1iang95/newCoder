package leetCoder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 电话号码的字母组合
 * @create : 2020/06/08 09:51
 */
public class LeetCode17 {
    //给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
    //给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母
    Map<String,String> phone = new HashMap<String, String>(){
        {
            put("2","abc");
            put("3","def");
            put("4","ghi");
            put("5","jkl");
            put("6","mno");
            put("7","pqrs");
            put("8","tuv");
            put("9","wxyz");
        }
    };
    List<String> res = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if (digits.length()!=0){
            backtrack("",digits);
        }
        return res;
    }

    private void backtrack(String combination, String next_digits) {
        if (next_digits.length()==0){
            res.add(combination);
        }else {
            String digit = next_digits.substring(0,1);
            String letters = phone.get(digit);
            for (int i = 0; i <letters.length() ; i++) {
                String letter = phone.get(digit).substring(i,i+1);
                backtrack(combination+letter,next_digits.substring(1));
            }
        }
    }
}
