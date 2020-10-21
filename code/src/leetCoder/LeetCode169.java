package leetCoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 多数元素
 * @create : 2020/07/07 08:33
 */
public class LeetCode169 {
    //给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
    //排序法
    public int majorityElement(int [] nums){
        Arrays.sort(nums);
        return nums[nums.length>>1];
    }
    //摩尔投票法
    public int majorityElement1(int[] nums){
        int curNum = nums[0];
        int count = 1;
        for (int i = 1; i <nums.length ; i++) {
            if (nums[i] == curNum){
                count++;
            }else {
                count--;
            }
            if (count==0){
                curNum = nums[i];
                count =1;
            }
        }
        return curNum;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strs = str.substring(1,str.length()-1).split(",");
        int[] nums = new int[strs.length];
        for (int i = 0; i <strs.length ; i++) {
            nums[i] = Integer.parseInt(strs[i]);
        }
//        Arrays.sort(nums);
//        System.out.println(nums[nums.length>>1]);
        int curNum = nums[0];
        int count = 1;
        for (int i=1;i<nums.length;i++){
            if (nums[i] == curNum){
                count++;
            }else if (--count ==0){
                curNum = nums[i];
                count = 1;
            }
        }
        System.out.println(curNum);
    }
}
