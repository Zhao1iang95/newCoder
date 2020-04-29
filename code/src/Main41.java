import java.util.PriorityQueue;

/**
 * @desc 数据流中的中位数
 * @author zhaoliang
 * @date 20200412
 */
public class Main41 {
    //中位数的左区间，大顶堆
    private PriorityQueue<Integer> queue1 = new PriorityQueue<>(((o1,o2) -> (o2 - o1)));
    //中位数的右区间，小顶堆
    private PriorityQueue<Integer> queue2 = new PriorityQueue<>();
    //数据流中的个数
    private int sum = 0;

    public void Insert(Integer num) {
        if(sum % 2== 0){
            //当两个堆的元素个数一样的时候此时新增一个元素，我是放入大顶堆（左区间）
            queue1.add(num);
        }else {
            queue2.add(num);
        }
        if (!queue2.isEmpty() && queue1.peek() > queue2.peek()){

            int temp1 = queue1.poll();
            int temp2 = queue2.poll();

            queue1.add(temp2);
            queue2.add(temp1);
        }
        sum++;
    }

    public Double GetMedian() {
        if ( sum % 2 == 1){
            return  (double) queue1.peek();
        }else {
            return (queue1.peek() + queue2.peek())/2.0;
        }
    }
}
