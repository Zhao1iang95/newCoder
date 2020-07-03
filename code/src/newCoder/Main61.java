import java.util.Arrays;

/**
 * @desc 扑克牌里面的顺子
 * @author zhaoliang
 * @date 20200421
 */
public class Main61 {
    //扑克牌的数字
    public boolean isContinuous(int [] numbers) {
        if (numbers.length == 0)
            return false;
        int sum = 0;
        for (int x : numbers){
            if (x == 0){
                sum ++;
            }
        }
        Arrays.sort(numbers);

        for (int i = sum + 1; i <numbers.length; i++){
            sum -= numbers[i] - numbers[i - 1] - 1;
            if (sum < 0 || numbers[i] == numbers[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
