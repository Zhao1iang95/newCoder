package SFOffer;

import java.util.Stack;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 包含min函数的栈
 * @create : 2020/09/27 09:53
 */
public class Test30 {
    //定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
    Stack<Integer> dataStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();
    public void push(int node){
        dataStack.push(node);
        minStack.push(minStack.isEmpty()?node:Math.min(minStack.peek(),node));
    }
    public void pop(){
        dataStack.pop();
        minStack.pop();
    }
    public int top(){
        return dataStack.peek();
    }
    public int min(){
        return minStack.peek();
    }
}
