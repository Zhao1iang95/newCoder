import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @desc 队列最大值
 * @author zhaoliang
 * @date 20200420
 */
public class Main59_ {
    //请定义一个队列并实现函数 max_value 得到队列里的最大值，
    // 要求函数max_value、push_back 和 pop_front 的均摊时间复杂度都是O(1)。
    //若队列为空，pop_front 和 max_value 需要返回 -1
    Queue<Integer> queue;//主队列
    Deque<Integer> deque;//辅助队列

    public void MaxQueue() {
        queue = new LinkedList<>();
        deque = new LinkedList<>();
    }

    public int max_value() {
        if (deque.isEmpty())
            return -1;
        return deque.peek();//getFirst();
    }

    public void push_back(int value) {
        //主队列正常加入
        queue.add(value);
        // 辅助队列清除尾部比当前值更小的元素
        while (!deque.isEmpty() && deque.getLast() < value){
            deque.removeLast();
        }
        deque.add(value);
    }

    public int pop_front() {
        if (queue.isEmpty())
            return -1;
        int res = queue.poll();//res 是主队列出队的值和辅助队列
        if (res == deque.peek()){
            deque.poll();
        }
        return res;
    }
}
