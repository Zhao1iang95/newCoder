package leetCodeGroup.arrayandmatrix;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 最多能完成排序的块
 * @create : 2020/08/07 15:31
 */
public class LeetCode769 {
    //数组arr是[0, 1, ..., arr.length - 1]的一种排列，
    // 我们将这个数组分割成几个“块”，并将这些块分别进行排序。
    // 之后再连接起来，使得连接的结果和按升序排序后的原数组相同。
    //我们最多能将数组分成多少块？
    public int maxChunksToSorted(int[] nums){
        if(nums==null)return 0;
        int ret =0;
        int right = nums[0];
        for (int i = 0; i <nums.length ; i++) {
            right = Math.max(right,nums[i]);
            if (right==i)ret++;
        }
        return ret;
    }
}
