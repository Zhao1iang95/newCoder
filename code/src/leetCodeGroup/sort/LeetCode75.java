package leetCodeGroup.sort;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 颜色分类
 * @create : 2020/08/18 14:17
 */
public class LeetCode75 {
    //给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
    //
    //此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
    public void sortColors(int [] nums){
        // all in [0, zero) = 0
        // all in [zero, i) = 1
        // all in [two, len - 1] = 2

        // 循环终止条件是 i == two，那么循环可以继续的条件是 i < two
        // 为了保证初始化的时候 [0, zero) 为空，设置 zero = 0，
        // 所以下面遍历到 0 的时候，先交换，再加
        int zero=0,i=0,two = nums.length;

        // 当 i == two 上面的三个子区间正好覆盖了全部数组
        // 因此，循环可以继续的条件是 i < two
        while (i<two){
            if(nums[i]==0){
                swap(nums,zero,i);
                zero++;
                i++;
            }else if(nums[i]==1){
                i++;
            }else {
                // 为了保证初始化的时候 [two, len - 1] 为空，设置 two = len
                // 所以下面遍历到 2 的时候，先减，再交换
                two--;
                swap(nums,i,two);
            }
        }
    }
    private void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
