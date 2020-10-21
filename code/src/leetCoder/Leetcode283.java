package leetCoder;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 移动零
 * @create : 2020/07/15 08:58
 */
public class Leetcode283 {
    //给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序
    public void moveZeros(int[] nums){
        if(nums.length!=0){
            for (int i = 0; i <nums.length-1 ; i++) {
                if(nums[i]==0){
                    swap(i,nums);
                }
            }
        }
    }

    private void swap(int i, int[] nums) {

        for (int j = i+1; j <nums.length ; j++) {
            if(nums[j]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                break;
            }
        }

    }
    //index
    public void moveZeros1(int[] nums){
        if (nums.length==0)return;
        int index =0;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]!=0){
                if(i!=index){
                    nums[index]=nums[i];
                    nums[i] = 0;
                }
                index++;
            }
        }
    }
}
