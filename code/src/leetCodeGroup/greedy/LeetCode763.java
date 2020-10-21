package leetCodeGroup.greedy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 划分字母区间
 * @create : 2020/08/21 10:24
 */
public class LeetCode763 {
    //字符串 S 由小写字母组成。我们要把这个字符串划分为尽可能多的片段，同一个字母只会出现在其中的一个片段。
    //返回一个表示每个字符串片段的长度的列表。
    public List<Integer> partitionLabels(String s) {
        //定义数组 last[char] 来表示字符 char 最后一次出现的下标。
        int[]last = new int[26];
        for (int i = 0; i <s.length() ; i++) {
            last[s.charAt(i)-'a'] = i;
        }
        //定义返回列表
        List<Integer> res = new ArrayList<>();
        // 定义 anchor 和 j 来表示当前区间的首尾。
        int anchor = 0;
        int j = 0;
        for (int i = 0; i <s.length() ; ++i) {
            //如果遇到的字符最后一次出现的位置下标大于 j， 就让 j=last[c] 来拓展当前的区间。
            j = Math.max(j,last[s.charAt(i)-'a']);
            // 当遍历到了当前区间的末尾时(即 i==j )，把当前区间加入答案，同时将 start 设为 i+1 去找下一个区间。
            if (i == j){
                res.add(j - anchor+1);
                anchor = i+1;
            }
        }
        return res;
    }
}
