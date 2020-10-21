package leetCodeGroup.stackandqueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 用队列实现栈
 * @create : 2020/08/03 09:06
 */
public class LeetCode225 {
    //在将一个元素 x 插入队列时，为了维护原来的后进先出顺序，
    // 需要让 x 插入队列首部。而队列的默认插入顺序是队列尾部，
    // 因此在将 x 插入队列尾部之后，需要让除了 x 之外的所有元素出队列，再入队列。
    //push(x) -- 元素 x 入栈
    //pop() -- 移除栈顶元素
    //top() -- 获取栈顶元素
    //empty() -- 返回栈是否为空
    private Queue<Integer> queue;
    public LeetCode225(){
        queue = new LinkedList<>();
    }
    public void push(int x){
        queue.add(x);
        int cnt = queue.size();
        while (cnt-- >1){
            queue.add(queue.poll());
        }
    }
    public int pop(){
        return queue.remove();
    }
    public int top(){
        return queue.peek();
    }
    public boolean empty(){
        return queue.isEmpty();
    }
}
