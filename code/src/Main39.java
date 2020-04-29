import java.util.HashMap;
import java.util.Map;

/**
 * @author：zjaoliang
 * @date：20200409
 * 数组中出现次数超过一半的数字
 */
public class Main39 {
//    public int MoreThanHalfNum_Solution(int [] array){
//        //存储每个数字出现的次数
//        Map<Integer,Integer> map = new HashMap<>();
//        //存储出现次数最多的数字
//        int target = 0;
//        //存储出现次数最多的次数
//        int sum = 0 ;
//        for(int x : array){
//            //更新当前位置的数字出现的次数
//            map.put(x,map.getOrDefault(x,0)+1);
//            if(sum<map.get(x)){
//                //说明当前位置的数字出现的次数比之前统计的target数字出现的次数多
//                sum = map.get(x);
//                target = x;
//            }
//        }
//        if(sum > array.length/2){
//            return target;
//        }
//        return 0;
//    }

    public int MoreThanHalfNum_Solution2(int [] array){
        if(array.length==0){
            return 0;
        }
        int target = array[0];
        int sum  = 0;
        for(int x : array){
            if(target == x){
                sum++;
            }else {
                sum--;
            }
            if(sum == 0){
                target = x;
                sum = 1;
            }
        }
        if(check(target,array)){
            return target;
        }
        return 0;
    }

    private boolean check(int target, int[] array) {
        int sum = 0;
        for(int x :array){
            if(x == target){
                sum++;
            }
        }
        return sum>array.length/2;
    }
}
