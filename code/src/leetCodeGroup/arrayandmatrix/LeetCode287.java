package leetCodeGroup.arrayandmatrix;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 寻找重复数
 * @create : 2020/08/07 09:42
 */
public class LeetCode287 {
    //给定一个包含 n + 1 个整数的数组 nums，其数字都在 1 到 n 之间（包括 1 和 n），
    // 可知至少存在一个重复的整数。假设只有一个重复的整数，找出这个重复的数
    public int findDuplicate(int[] nums){
        int l =1,h = nums.length-1;
        while(l<=h){
            int mid = l+(h-l)/2;
            int cnt =0;
            for (int i = 0; i <nums.length ; i++) {
                if (nums[i]<=mid){
                    cnt++;
                }
            }
            if (cnt>mid){
                h = mid-1;
            }else {
                l = mid+1;
            }
        }
        return l;
    }
}
