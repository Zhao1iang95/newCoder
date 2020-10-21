package leetCodeGroup.stackandqueue;

import java.util.Stack;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 最小值栈
 * @create : 2020/08/03 09:20
 */
public class LeetCode155 {
    //设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
    //
    //push(x) —— 将元素 x 推入栈中。
    //pop() —— 删除栈顶的元素。
    //top() —— 获取栈顶元素。
    //getMin() —— 检索栈中的最小元素。
    private Stack<Integer> dataStack;
    private Stack<Integer> minStack;
    private int min;
    public LeetCode155(){
        dataStack = new Stack<>();
        minStack = new Stack<>();
        min = Integer.MAX_VALUE;
    }
    public  void  push(int x){
        dataStack.add(x);
        min = Math.min(min,x);
        minStack.add(min);
    }
    public  void  pop(){
        dataStack.pop();
        minStack.pop();
        min = minStack.isEmpty()?Integer.MAX_VALUE:minStack.peek();
    }
    public int top(){
        return dataStack.peek();
    }
    public int getMin(){
        return minStack.peek();
    }
}
