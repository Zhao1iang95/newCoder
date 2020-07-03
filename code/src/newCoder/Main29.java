import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @desc 最小的k个数
 * @author zhaoliang
 * @date 20200518
 */
public class Main29 {
    //输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
    //快排
    public int[] getLeastNumbers1(int[] arr, int k) {
        if (arr.length == 0 || k == 0) {
            return new int[0];
        }
        //最后一个参数代表我们要找的第k-1个数
        return quickSort(arr,0,arr.length-1,k-1);
    }

    private int[] quickSort(int[] nums, int lo, int hi, int k) {
    //每次快排切分1次，找到排序后下标为j的元素，如果j恰好就是返回j以及j左边所有的数。
        int j = partition(nums,lo,hi);
        if (j == k){
            return Arrays.copyOf(nums,j+1);
        }
        //否则根据下标j与k大小关系来决定继续切分左边还是右边
        return j >k ?quickSort(nums,lo,j-1,k):quickSort(nums,j+1,hi,k);
    }
    //快速切分，返回下标j，是的nums比nums[j]小的在j的左边，比其大的在右边。
    private int partition(int[] nums, int lo, int hi) {
        int v= nums[lo];
        int i = lo,j = hi+1;
        while (true){
            while (++i <= hi && nums[i] < v);
            while (--j >= lo && nums[j] >v);
            if (i > j){
                break;
            }
            int t = nums[j];
            nums[j] = nums[i];
            nums[i] = t;
        }
        nums[lo] = nums[j];
        nums[j] = v;
        return j;
    }
    //大顶堆
    public int[] getLeastNumbers2(int[] arr, int k) {
            if(k == 0 || arr.length == 0){
                return new int[0];
            }
            //默认是最小堆，实现大根堆需要重写比较器
        Queue<Integer> pq = new PriorityQueue<>((v1,v2)->v2 - v1);
            for (int num : arr){
                if (pq.size() < k){
                    pq.offer(num);
                }else if (num < pq.peek()){
                    pq.poll();
                    pq.offer(num);
                }
            }
            //组装返回数组
            int[] res = new int[pq.size()];
            int idx = 0;
            for (int num : pq){
                res[idx++] = num;
            }
            return res;
    }
    //牛客
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        //大顶堆
        if(input.length == 0 || k==0){
            return new ArrayList<>();
        }
        Queue<Integer> queue = new PriorityQueue<>((v1,v2)->v2 - v1);
        for (int num :input){
            if (queue.size()<k){
                queue.offer(num);
            }else if(num < queue.peek()){
                queue.poll();
                queue.offer(num);
            }
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int x : queue){
            arrayList.add(x);
        }
        return arrayList;
    }
}