package leetCodeGroup.stackandqueue;

import java.util.Stack;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 用栈实现队列
 * @create : 2020/08/03 08:53
 */
public class LeetCode232 {
    //使用栈实现队列的下列操作：
    //
    //push(x) -- 将一个元素放入队列的尾部。
    //pop() -- 从队列首部移除元素。
    //peek() -- 返回队列首部的元素。
    //empty() -- 返回队列是否为空。
    public LeetCode232(){

    }
    private Stack<Integer> in = new Stack<>();
    private Stack<Integer> out = new Stack<>();
    public void push(int x){
        in.push(x);
    }
    public int pop(){
        inToOut();
        return out.pop();
    }
    public int peek(){
        inToOut();
        return out.peek();
    }
    private void inToOut() {
        if(out.isEmpty()){
            while (!in.isEmpty()){
                out.push(in.pop());
            }
        }
    }
    public boolean empty(){
        return in.isEmpty() && out.isEmpty();
    }
}
