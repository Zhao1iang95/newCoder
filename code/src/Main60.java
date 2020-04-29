
/**
 * @desc n个骰子的点数
 * @author zhaoliang
 * @date 20200421
 */
public class Main60 {
    // n个骰子的点数,先求次数最后遍历求概率
    public double[] twoSum(int n){
        int [] [] d = new int[n + 1][6 * n + 1];
        double [] res = new double[5 * n + 1];
        for (int i = 1 ;i <=6; i++){//只有一个骰子，每个点数出现的次数都是1
            d[1][i] = 1;
        }
        for (int i = 2; i <= n ;i++){//从第二个骰子开始，骰子总数小于n
            for (int j = i; j <= 6*i; j++){ //点数和从2开始，小于6 * i；例如2个骰子，点数和小于12
                for (int k = 1; k<= 6 ;k++){ //每个骰子都有1～6种可能
                    if (j >= k)//例如，当点数和大于单独一个骰子的，当前骰子的点数出现的次数等于加上它的上一个。n + (n - 1)
                        d[i][j] += d[i - 1][j - k];
                }
            }
        }
        for (int i = 0;i < 5 *n + 1; i++){
            res[i] = d[n][i + n]/Math.pow(6,n);
        }
        return res;
    }
}
