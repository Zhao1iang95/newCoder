/**
 * @desc 调整数组使得奇数在偶数之前
 * @author zhaoliang
 * @date 20200429
 */
public class Main13 {
    //输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
    // 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
    public void reOrderArray(int [] array) {
        for (int i = 0;i<array.length;i++){
            if (array[i] %2 !=0){//当前位置时奇数
                for (int j = i -1;j>=0;j--){
                    if (array[j]%2==0){//当前位置的前面有是偶数
                        //执行交换操作
                        int temp =array[j];
                        array[j] = array[j +1];
                        array[j + 1]=temp;
                    }else {
                        //i和i-1位置都是奇数，退出
                        break;
                    }
                }
            }
        }
    }
    //leetcode  超时
    public int[] exchange1(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                for(int j=i-1;j>=0;j--){
                    if(nums[j]%2==0){
                        int temp=nums[j];
                        nums[j]=nums[j+1];
                        nums[j+1] = temp;
                    }
                }
            }
        }
        return nums;
    }
    //
    public int[] exchange2(int[] nums) {
        int left=0;
        int right=nums.length-1;
        while (left <right){
            while (nums[left]%2!=0 && left<right){//奇数
                left++;
            }
            while (nums[right]%2==0 && left<right){//偶数
                right--;
            }
            int temp=nums[left];
            nums[left] =nums[right];
            nums[right] = temp;
        }

        return nums;
    }
}
