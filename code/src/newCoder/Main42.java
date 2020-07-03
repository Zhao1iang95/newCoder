/**
 * @desc 最大连续子序列的和
 * @author zhaoliang
 * @date 20200412
 */
//1:n^2复杂度
//public class Main42 {
//    public int FindGreatestSumOfSubArray(int[] array) {
//        int[] sum = new int[array.length];//用来统计0-i位置的和
//        sum[0] =array[0];
//        for(int i = 0;i<array.length;i++){
//            sum[i] = sum[i- 1] + array[i];
//        }
//        int Max = sum[0];//默认第一个元素
//        //i是终点，j是起点
//        for(int i = 0;i<array.length;i++){
//            for(int j = 0; j <=i;j++){
//                if(j == 0){
//                    Max = Math.max(Max,sum[i]);//说明起点在第0个位置
//                }else {
//                    Max = Math.max(Max,sum[i] - sum[j-1]);//j-i的和它就等于从起点到i位置之和减去从起点到j-1的位置之和；
//                }
//
//            }
//        }
//        return Max;
//    }
//}

public class Main42 {
        public int FindGreatestSumOfSubArray(int[] array) {
            int sum = 0;
            int Max = array[0];
            for(int i = 0;i<array.length;i++){
                sum+=array[i];
                //为了防止都是负数的情况
                Max = Math.max(Max,sum);
                if(sum<0){
                    sum=0;
                }
            }
            return Max;
        }


}