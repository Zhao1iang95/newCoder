package leetCodeGroup.stackandqueue;

import java.util.Stack;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 有效的括号
 * @create : 2020/08/03 09:32
 */
public class LeetCode20 {
    //给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
    //
    //有效字符串需满足：
    //
    //左括号必须用相同类型的右括号闭合。
    //左括号必须以正确的顺序闭合。
    //注意空字符串可被认为是有效字符串。
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()){
            if(c=='(' || c =='{' || c=='['){
                stack.push(c);
            }else {
                if(stack.isEmpty()){
                    return false;
                }
                char cStack = stack.pop();
                boolean b1 = c ==')' && cStack!='(';
                boolean b2 = c =='}' && cStack!='{';
                boolean b3 = c ==']' && cStack!='[';
                if(b1 || b2 || b3){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
