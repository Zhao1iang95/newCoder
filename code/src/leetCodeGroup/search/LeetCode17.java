package leetCodeGroup.search;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 电话号码的字母组合
 * @create : 2020/09/07 08:19
 */
public class LeetCode17 {
    //给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
    //
    //给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
    private static final String[] KEYS = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits){
        List<String> combinations = new ArrayList<>();
        if (digits == null || digits.length() == 0){
            return combinations;
        }
        doCombination(new StringBuffer(),combinations,digits);
        return combinations;
    }

    private void doCombination(StringBuffer prefix, List<String> combinations, String digits) {
        if (prefix.length() == digits.length()){
            combinations.add(prefix.toString());
            return;
        }
        int curDigits = digits.charAt(prefix.length()) - '0';
        String letter = KEYS[curDigits];
        for (char c:letter.toCharArray()) {
            prefix.append(c);
            doCombination(prefix,combinations,digits);
            prefix.deleteCharAt(prefix.length()-1);
        }
    }
}
