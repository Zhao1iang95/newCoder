package leetCoder;

import java.util.*;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 数组中第k个最大元素
 * @create : 2020/07/09 10:27
 */
public class LeetCode215 {
    //在未排序的数组中找到第 k 个最大的元素。
    // 请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
    //暴力，Java底层排序就是使用的快排
    public int foindKthLarges(int[] nums,int k){
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
    //基于快排，手写partition
    public int findKLarges(int[] nums,int k){
        int len = nums.length;
        int left = 0;
        int right = len-1;

        //转换，第k大就是下标为len-k；
        int target = len-k;
        while (true){
            int index= partition(nums,left,right);
            if (index == target){
                return nums[index];
            }else if(index < target){
                left = index+1;
            }else {
                right = index-1;
            }
        }
    }

    private int partition(int[] nums, int left, int right) {
        int pivot = nums[left];
        int j = left;
        for (int i = left; i <=right ; i++) {
            if (nums[i] < pivot){
                j++;
                swap(nums,j,i);
            }
        }
        swap(nums,j,left);
        return j;
    }

    private void swap(int[] nums, int j, int i) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
    //优先队列，堆
    public  int findKthLargest(int [] nums,int k){
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int num:nums) {
            heap.add(num);
            if (heap.size()>k){
                heap.poll();
            }
        }
        return heap.peek();
    }
}
