package leetCoder;


/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 颜色分类
 * @create : 2020/06/22 08:58
 */
public class LeetCode75 {
    //给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
    //
    //此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
    //
    //注意:
    //不能使用代码库中的排序函数来解决这道题。
    //计数排序
    public void sortColors(int[] nums) {
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) a++;
            if (nums[i] == 1) b++;
            if (nums[i] == 2) c++;
        }
        for (int j = 0; j < nums.length; j++) {
            if (a > 0) {
                nums[j] = 0;
                a--;
            } else if (b > 0) {
                nums[j] = 1;
                b--;
            } else {
                nums[j] = 2;
                c--;
            }
        }
    }

}
