package leetCodeGroup.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 根据身高重建队列
 * @create : 2020/08/19 09:59
 */
public class LeetCode406 {
    //假设有打乱顺序的一群人站成一个队列。 每个人由一个整数对(h, k)表示，其中h是这个人的身高，k是排在这个人前面且身高大于或等于h的人数。
    // 编写一个算法来重建这个队列。
    public int[][] reconstructQueue(int[][] people){
        //为了使插入操作不影响后续的操作，身高较高的学生应该先做插入操作，否则身高较小的学生原先正确插入的第 k 个位置可能会变成第 k+1 个位置。
        //
        //身高 h 降序、个数 k 值升序，然后将某个学生插入队列的第 k 个位置中。
        if (people==null || people.length==0 || people[0].length==0){
            return new int[0][0];
        }
        Arrays.sort(people,(a,b)->(a[0]==b[0] ? a[1]-b[1]:b[0]-a[0]));
        List<int[]> queue = new ArrayList<>();
        for (int[] p:people) {
            queue.add(p[1],p);
        }
        return queue.toArray(new int[queue.size()][]);
    }

}
