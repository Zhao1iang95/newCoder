package SFOffer;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 最小的K个数
 * @create : 2020/09/29 10:21
 */
public class Test40 {
    //输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input,int k){
        //应该使用大顶堆来维护最小堆，而不能直接创建一个小顶堆并设置一个大小，企图让小顶堆中的元素都是最小元素。
        //
        //维护一个大小为 K 的最小堆过程如下：在添加一个元素之后，如果大顶堆的大小大于 K，那么需要将大顶堆的堆顶元素去除。
        if (k > input.length || k <=0)return new ArrayList<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(((o1, o2) -> o2 -o1));
        for (int num:input
             ) {
            maxHeap.add(num);
            if (maxHeap.size() > k)
                maxHeap.poll();
        }
        return new ArrayList<>(maxHeap);
    }
}
