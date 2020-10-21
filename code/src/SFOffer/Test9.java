package SFOffer;

import java.util.Stack;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 用两个栈实现队列
 * @create : 2020/09/22 08:40
 */
public class Test9 {
    //用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
    Stack<Integer> in = new Stack<>();
    Stack<Integer> out = new Stack<>();
    public void push(int node){
        in.push(node);
    }
    public int pop() throws Exception {
        if (out.isEmpty()){
            while (!in.isEmpty()){
                out.push(in.pop());
            }
        }
        if (out.isEmpty()){
            throw new Exception("queue is empty");
        }
        return out.pop();
    }
}
