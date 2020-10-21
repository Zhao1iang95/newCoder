package leetCodeGroup.dp;

import java.util.Arrays;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 最长上升子序列
 * @create : 2020/09/13 10:23
 */
public class LeetCode300 {
    //给定一个无序的整数数组，找到其中最长上升子序列的长度。
    public int lengthOfLIS(int[] nums){
        int n = nums.length;
        int [] dp = new int[n];
        for (int i = 0; i <n ; i++) {
            int max=1;
            for (int j = 0; j <i ; j++) {
                if (nums[i]>nums[j]){
                    max = Math.max(max,dp[j]+1);
                }
            }
            dp[i] = max;
        }
        return Arrays.stream(dp).max().orElse(0);
    }
    //二分查找
    public int lengthOfLIS2(int[] nums){
        int n = nums.length;
        int [] tails = new int[n];
        int len = 0;
        for (int num:nums
             ) {
            int index = binarySearch(tails,len,num);
            tails[index] = num;
            if (index == len){
                len++;
            }
        }
        return len;
    }

    private int binarySearch(int[] tails, int len, int key) {
        int l=0,h = len;
        while (l<len){
            int mid = l + (h-l)/2;
            if(tails[mid] == key){
                return mid;
            }else if(tails[mid] > key){
                h = mid;
            }else {
                l = mid+1;
            }
        }
        return l;
    }
}
