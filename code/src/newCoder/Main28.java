import java.util.HashMap;
import java.util.Map;

/**
 * @desc 数组中数字出现一半的数字
 * @author zhaoliang
 * @date 20200518
 */
public class Main28 {
    //数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
    //例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
    public int MoreThanHalfNum_Solution(int [] array) {
        Map<Integer,Integer> map =new HashMap<>();//去存储每个数字出现的次数
        int target = 0;//用来存储出现次数最多的数字
        int sum = 0;//用来存储出现次数最多的数字出现的次数
        for (int x: array){
            map.put(x,map.getOrDefault(x,0)+1);//更新当前位置出现的次数
            if (sum < map.get(x));
            sum = map.get(x);
            target = x;
        }
        if (sum > array.length / 2){
            return target;
        }
        return 0;
    }
    //方法二，不用On的空间复杂度
    public int MoreThanHalfNum_Solution2(int [] array) {
        if (array.length == 0){
            return 0;
        }
        int target = array[0];
        int sum = 0;
        for(int x : array){
            if (x == target){
                sum++;
            }else{
                sum --;
            }
            if (sum == 0){
                target = x;
                sum = 1;
            }
        }
        if (check(target,array)){
            return target;
        }
        return 0;
    }

    private boolean check(int target, int[] array) {
        int sum = 0;
        for (int x:array){
            if (x== target){
                sum++;
            }
        }
        return sum > array.length / 2;
    }
}
