package leetCodeGroup.sort;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 数组中的第K个最大元素
 * @create : 2020/08/14 10:15
 */
public class LeetCode215 {
    //在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
    public int findKthLargest1(int [] nums,int k){
    //使用内置排序方法，Array.sort
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
    public int findKthLargest2(int [] nums,int k){
        //堆排序
        PriorityQueue<Integer> pq = new PriorityQueue<>();//小顶堆
        for (int val:nums) {
            pq.add(val);
            if (pq.size()>k){//维护堆的大小一直为K
                pq.poll();
            }
        }
        return pq.peek();
    }
    public int findKthLargest3(int[] nums,int k){
        //;快排
        int len = nums.length;
        int left = 0;
        int right = len-1;
        //转换一下，正序排序之后，第K大的元素的索引是len-k;
        k = len -k;
        while(true){
            int index = partition(nums,left,right);
            if(index == k){
                return nums[k];
            }else if(index < k){
                left = index +1;
            }else {
                right = index-1;
            }
        }
    }

    private int partition(int[] nums, int left, int right) {
        int pivot = nums[left];
        int j = left;
        for (int i = left+1; i <=right ; i++) {
                if(nums[i] < pivot){
                    j++;
                    swap(nums,j,i);
                }
        }
        //原pivot位置不动，一直比较其后面的数字与标准值。最后j为位置与标准值位置交换，j位置就是标准值最后的位置
        swap(nums,j,left);
        return j;

    }
    private void swap(int[] nums,int l,int j){
        int temp = nums[l];
        nums[l] = nums[j];
        nums[j] = temp;
    }
}
