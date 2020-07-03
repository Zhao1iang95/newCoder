import java.util.ArrayList;
import java.util.Comparator;

/**
 * @desc 把数组组成最小的数
 * @author zhaoliang
 * @date 20200413
 */
public class Main45 {
    private static String PrintMinNumber(int [] numbers) {
        ArrayList<String> arrayList = new ArrayList<>();

        for (int x:numbers)
            arrayList.add(x+"");
        arrayList.sort((o1, o2) -> {
            String a1 = o1+o2;
            String a2 = o2+o1;
            return a1.compareTo(a2);
        });
        StringBuilder ans =new StringBuilder();
        for (String x :arrayList){
            ans.append(x);
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        int[] numbers={3,231,23};
        PrintMinNumber(numbers);
    }
}
