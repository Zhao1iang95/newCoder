package SFOffer;

import java.util.Arrays;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 扑克牌顺子
 * @create : 2020/10/06 08:06
 */
public class Test61 {
    //五张牌，其中大小鬼为癞子，牌面为 0。判断这五张牌是否能组成顺子。
    public boolean isContinuous(int[] numbers){
        if (numbers.length<5){
            return false;
        }
        Arrays.sort(numbers);
        //统计癞子的数量
        int cnt = 0;
        for (int num:numbers
             ) {
            if (num == 0){
                cnt++;
            }
        }
        //使用癞子去补全不连续的顺子
        for (int i = cnt; i <numbers.length-1 ; i++) {
            if (numbers[i+1] == numbers[i]){
                return false;
            }
            cnt-=numbers[i+1] - numbers[i]-1;
        }
        return cnt >=0;
    }
}
