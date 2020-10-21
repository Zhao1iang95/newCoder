package leetCodeGroup.stackandqueue;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 下一个更大元素 II
 * @create : 2020/08/03 10:36
 */
public class LeetCode503 {
    //给定一个循环数组（最后一个元素的下一个元素是数组的第一个元素），
    // 输出每个元素的下一个更大元素。数字 x 的下一个更大的元素是按数组遍历顺序，
    // 这个数字之后的第一个比它更大的数，这意味着你应该循环地搜索它的下一个更大的数。如果不存在，则输出 -1。
    public int[] nextGreaterElements(int[] nums){
        int n = nums.length;
        int[] dist = new int[n];
        Arrays.fill(dist,-1);
        Stack<Integer> stack = new Stack<>();
        for (int i =0;i<n*2;i++){
            int num = nums[i %n];
            while (!stack.isEmpty() && nums[stack.peek()] <num){
                dist[stack.pop()] = num;
            }
            if(i < n){
                stack.push(i);
            }
        }
        return dist;
    }
}
