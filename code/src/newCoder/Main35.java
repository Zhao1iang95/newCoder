/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 数组中的逆序对
 * @create : 2020/05/21 07:26
 */
public class Main35 {
    /**
     * @param array
     * @return
     * @description 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
     * 输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 即输出P%1000000007
     */
    //暴力超时
    public int InversePairs(int[] array) {
        if (array.length < 2) {
            return 0;
        }
        int res = 0;
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = j + 1; i < array.length; i++) {
                if (array[j] > array[i]) {
                    res++;
                }
            }
        }
        return res % 1000000007;
    }
    //归并排序
        public int reversePairs(int[] array) {
            //长度小于2，没有逆序对
            int len = array.length;
            if (len< 2) {
                return 0;
            }
            //复制一份数组，不操作原数组
            int[] copy = new int[len];
            //copy
            for (int i = 0; i < len; i++) {
                copy[i] = array[i];
            }
            //辅助数组
            int[] temp = new int[len];
            return reversePairs(copy, 0, len - 1, temp);

        }

        /**
         * 划分
         * @param nums
         * @param left
         * @param right
         * @param temp
         * @return
         */
        private int reversePairs(int[] nums, int left, int right, int[] temp) {
            //左右指针相等，只剩一个，无count可加
            if (left == right) {
                return 0;
            }
            //计算mid，避免left，right过大整型溢出
            int mid = left + (right - left) / 2;
            //归并左边
            int leftPairs = reversePairs(nums, left, mid, temp);
            //归并右边
            int rightPairs = reversePairs(nums, mid + 1, right, temp);
            //只剩两个
            if (nums[mid] <= nums[mid + 1]) {
                return leftPairs + rightPairs;
            }
            //调整排序，计算逆序对
            int crossPairs = mergerPairs(nums, left, mid, right, temp);
            //返回逆序对总数
            return leftPairs + rightPairs + crossPairs;
        }

        private int mergerPairs(int[] nums, int left, int mid, int right, int[] temp) {
            //深拷贝辅助数组
            for (int i = left; i <= right; i++) {
                temp[i] = nums[i];
            }
            //左边数组第一个数
            int i = left;
            //右边数组第一个
            int j = mid + 1;
            int count = 0;
            for (int k = left; k <=right; k++) {
                //左边为空
                if (i == mid + 1) {
                    nums[k] = temp[j];
                    j++;
                    //右边为空
                } else if (j == right + 1) {
                    nums[k] = temp[i];
                    i++;
                    //左边小于右边
                } else if (temp[i] <= temp[j]) {
                    nums[k] = temp[i];
                    i++;
                    //右边小于左边
                } else {
                    nums[k] = temp[j];
                    j++;
                    count += (mid - i + 1);
                }
            }
            return count;
        }
    }
