package leetCoder;

import java.util.Scanner;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 乘积最大子数组
 * @create : 2020/07/03 14:58
 */
public class LeetCode152 {
    //给你一个整数数组 nums ，请你找出数组中乘积最大的连续子数组（该子数组中至少包含一个数字），并返回该子数组所对应的乘积。
    public double maxProduct(int[] nums){
      double max = Double.MIN_VALUE,imax = 1,imin = 1;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i] < 0){
            double temp = imax;
            imax = imin;
            imin = temp;
            }
            imax = Math.max(imax*nums[i],nums[i]);
            imin = Math.min(imin*nums[i],nums[i]);

            max = Math.max(imax,max);
        }
        return max;
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        double[] arr = new double[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextDouble();
        }

        double max = 1,min = 1,res = Integer.MIN_VALUE,p=0,q=0;
        for(int i=0;i<n;i++) {
            p = max * arr[i];
            q = min * arr[i];
            max = Math.max(Math.max(p, q), arr[i]);
            min = Math.min(Math.min(p, q), arr[i]);
            res = Math.max(res, max);
        }

        System.out.print(String.format("%.2f", res));

    }
}
