package leetCodeGroup.twolookup;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 有序数组中的单一元素
 * @create : 2020/08/24 11:04
 */
public class LeetCode540 {
    //给定一个只包含整数的有序数组，每个元素都会出现两次，唯有一个数只会出现一次，找出这个数。
    //令 index 为 Single Element 在数组中的位置。在 index 之后，数组中原来存在的成对状态被改变。
    //如果 m 为偶数，并且 m + 1 < index，那么 nums[m] == nums[m + 1]；m + 1 >= index，那么 nums[m] != nums[m + 1]。
    //
    //从上面的规律可以知道，如果 nums[m] == nums[m + 1]，那么 index 所在的数组位置为 [m + 2, h]，此时令 l = m + 2；
    // 如果 nums[m] != nums[m + 1]，那么 index 所在的数组位置为 [l, m]，此时令 h = m。
    //
    //因为 h 的赋值表达式为 h = m，那么循环条件也就只能使用 l < h 这种形式。
    public int singleNonDuplicate(int[] nums){
    //可以使用异或运算，本题使用二分查找
        int l=0,h = nums.length-1;
        while (l <h){
            int m = l + (h-l)/2;
            if (m % 2 ==1){
                m--;// 保证 l/h/m 都在偶数位，使得查找区间大小一直都是奇数
            }
            if (nums[m] == nums[m+1]){
                l = m+2;
            }else {
                h = m;
            }
        }
        return nums[l];
    }
}
