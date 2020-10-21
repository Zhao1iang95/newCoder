package leetCodeGroup.arrayandmatrix;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 移动零
 * @create : 2020/08/06 09:36
 */
public class LeetCode283 {
    //给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
    public void moveZeroes(int[] nums){
        int idx = 0;
        for(int num:nums){
            if(num!=0){
                nums[idx++] = num;
            }
        }
        while (idx<nums.length){
            nums[idx++] = 0;
        }
    }
}
