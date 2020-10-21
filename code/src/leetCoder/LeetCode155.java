package leetCoder;

import java.util.Stack;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 最小栈
 * @create : 2020/07/06 08:52
 */
public class LeetCode155 {
    //
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    public  LeetCode155(){
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    public void push(int x){
        stack.push(x);
        if (minStack.isEmpty() || x <=minStack.peek()){
            minStack.push(x);
        }
    }
    public void pop(){
        if (stack.pop().equals(minStack.peek())){
            minStack.pop();
        }
    }
    public int top(){
        return stack.peek();
    }
    public int getMin(){
        return minStack.peek();
    }
}
