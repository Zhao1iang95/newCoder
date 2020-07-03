package leetCoder;

import java.util.Stack;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 最长有效括号
 * @create : 2020/06/12 09:17
 */
public class LeetCode32 {
    //给定一个只包含 '(' 和 ')' 的字符串，找出最长的包含有效括号的子串的长度
    public int longestValidParentheses(String s) {
    //栈
        int maxans = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i) =='('){
                stack.push(i);
            }else {
                stack.pop();
                if (stack.empty()){
                    stack.push(i);
                }else {
                    maxans = Math.max(maxans,i-stack.peek());
                }
            }
        }
        return maxans;
    }
}
