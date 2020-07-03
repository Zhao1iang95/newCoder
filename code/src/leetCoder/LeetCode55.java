package leetCoder;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 跳跃游戏
 * @create : 2020/06/18 09:38
 */
public class LeetCode55 {
    /**
     *     给定一个非负整数数组，你最初位于数组的第一个位置。
     *
     *     数组中的每个元素代表你在该位置可以跳跃的最大长度。
     *
     *     判断你是否能够到达最后一个位置。
     */
    public boolean canJump(int[] nums) {
        int max_index = nums[0];

        for (int i = 0; i <nums.length ; i++) {
           if (i > max_index){
               return false;
           }
           max_index = Math.max(max_index,i + nums[i]);
        }
        return true;
    }
}
