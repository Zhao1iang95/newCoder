package leetCoder;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 滑动窗口最大值
 * @create : 2020/07/13 09:46
 */
public class LeetCode239 {
    // 给定一个数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。
    // 你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位。
    // 返回滑动窗口中的最大值。
    //暴力
    public int [] maxSlidingWindow(int[] nums,int k){
        int len = nums.length;
        int[] res = new int[len-k+1];
        for (int i = 0; i <len-k+1 ; i++) {
            int maxNum = nums[i];
            for (int j = i; j <i+k ; j++) {
                maxNum = Math.max(maxNum,nums[j]);
            }
            res[i] = maxNum;
        }
        return res;
    }
    //双向队列
    public int[] maxSlidingWindow1(int[] nums,int k){
        Deque<Integer> deque = new ArrayDeque<>();
        int len = nums.length;
        if (len==0)return nums;
        int[] res = new int[len-k+1];
        int index =0;
        for (int i = 0; i <len ; i++) {
            if(i>=k){
                if(deque.peekFirst() == nums[i-k]){
                    deque.removeFirst();
                }
            }
            while (!deque.isEmpty() && nums[i] >deque.peekLast()){
                deque.removeLast();
            }
            deque.addLast(nums[i]);
            if(i >=k-1){
                res[index++] = deque.peekFirst();
            }
        }
        return res;
    }

}
