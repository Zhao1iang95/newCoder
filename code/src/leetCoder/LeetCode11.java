package leetCoder;

import sun.jvm.hotspot.opto.MachIfNode;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 盛最多水的容器
 * @create : 2020/06/05 10:43
 */
public class LeetCode11 {
    /**
     * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。
     * 在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。
     * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
     * 说明：你不能倾斜容器，且 n 的值至少为 2。
     */
    //暴力
    public int maxArea(int[] height) {
        int maxArea = 0;
        for (int i = 0; i <height.length ; i++) {
            for (int j = i+1; j <height.length ; j++) {
                maxArea = Math.max(maxArea,Math.min(height[i],height[j])*(j-i));
            }
        }
        return maxArea;
    }
    //双指针
    public int maxArea1(int[] height) {
        int maxArea =0,l=0,r = height.length-1;
        while (l < r){
            maxArea = Math.max(maxArea,Math.min(height[l],height[r])*(r-l));
            if (height[l] <= height[r]){
                l++;
            }else {
                r--;
            }
        }
        return maxArea;
    }
}
