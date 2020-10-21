package leetCodeGroup.sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 根据字符出现的频率排序
 * @create : 2020/08/18 13:58
 */
public class LeetCode451 {
    //给定一个字符串，请将字符串里的字符按照出现的频率降序排列。
    public String frequencySort(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for (Character c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        //桶排序
        List<Character>[] list = new ArrayList[s.length()+1];
        for (char key:map.keySet()) {
            int f = map.get(key);
            if(list[f]==null){
                list[f] = new ArrayList<>();
            }
            list[f].add(key);
        }
        //倒序输出
        StringBuilder str = new StringBuilder();
        for (int i = list.length-1; i >0 ; i--) {
            if(list[i]==null)continue;
            for (char c:list[i]) {
                for (int j = 0; j <i ; j++) {
                    str.append(c);
                }
            }
        }
        return str.toString();
    }
}
