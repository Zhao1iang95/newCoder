package SFOffer;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 滑动窗口最大值
 * @create : 2020/10/05 09:09
 */
public class Test59 {
    public ArrayList<Integer> maxInWindows(int[] num,int size){
        ArrayList<Integer> ret = new ArrayList<>();
        if (size > num.length || size<1)return ret;

        PriorityQueue<Integer> heap = new PriorityQueue<>((o1, o2) -> o2 - o1);//大顶堆
        for (int i = 0; i <size ; i++) {
            heap.add(num[i]);
        }
        ret.add(heap.peek());
        for (int i = 0,j=i+size ;j<num.length; i++,j++) {//维护一个大小为size的大顶堆
            heap.remove(num[i]);
            heap.add(num[j]);
            ret.add(heap.peek());
        }
        return ret;
    }
}
