package leetCodeGroup.division;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 为运算表达式设计优先级
 * @create : 2020/08/25 09:19
 */
public class LeetCode241 {
    //给定一个含有数字和运算符的字符串，为表达式添加括号，改变其运算优先级以求出不同的结果。
    // 你需要给出所有可能的组合的结果。有效的运算符号包含 +, - 以及 * 。
    public List<Integer> diffWaysToCompute(String input){
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i <input.length() ; i++) {
            char c = input.charAt(i);
            if(c=='+'||c=='-'||c=='*'){
                List<Integer> left = diffWaysToCompute(input.substring(0,i));
                List<Integer> right = diffWaysToCompute(input.substring(i+1));
                for (int l : left) {
                    for (int r:right) {
                        switch (c){
                            case '+':
                                res.add(l+r);
                                break;
                            case '-':
                                res.add(l-r);
                                break;
                            case '*':
                                res.add(l*r);
                                break;
                        }
                    }
                }

            }
        }
        if (res.size()==0){
            res.add(Integer.valueOf(input));
        }
        return res;
    }
}
