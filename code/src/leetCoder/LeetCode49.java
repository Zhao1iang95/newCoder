package leetCoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 字母异位词分组
 * @create : 2020/06/17 09:29
 */
public class LeetCode49 {
    //给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hash = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] s_arr = strs[i].toCharArray();
            //排序
            Arrays.sort(s_arr);
            //映射到key
            String key = String.valueOf(s_arr);
            //添加到对应的类中
            if (hash.containsKey(key)){
                hash.get(key).add(strs[i]);
            }else {
                List<String> temp = new ArrayList<String>();
                temp.add(strs[i]);
                hash.put(key,temp);
            }
        }
        return new ArrayList<List<String>>(hash.values());
    }
}
