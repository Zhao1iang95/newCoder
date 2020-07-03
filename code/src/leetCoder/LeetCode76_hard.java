package leetCoder;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 最小覆盖子串
 * @create : 2020/06/23 08:53
 */
public class LeetCode76_hard {
    //给你一个字符串 S、一个字符串 T，请在字符串 S 里面找出：包含 T 所有字符的最小子串。
    public String minWindow(String s, String t) {
        if (s ==null || s=="" || t==null || t=="" || s.length() < t.length()){
            return "";
        }
        //维护数组，记录指定字符出现的次数
        int[] need = new int[128];
        int[] have = new int[128];
        //目标字符出现次数记录
        for (int i = 0; i <t.length() ; i++) {
            need[t.charAt(i)]++;
        }
        int left = 0;
        int right = 0;
        int min = s.length() +1;
        int count = 0;
        int start = 0;
        while (right < s.length()){
            char r = s.charAt(right);

            if (need[r] ==0){
                right++;
                continue;
            }
            if (have[r] < need[r]){
                count++;
            }
            have[r] ++;
            right++;
            while (count==t.length()){
                if (right-left < min){
                    min = right-left;
                    start = left;
                }
                char l = s.charAt(left);
                if (need[l]==0){
                    left++;
                    continue;
                }
                if (have[l] == need[l]){
                    count--;
                }
                have[l]--;
                left++;
            }

        }
        if (min == s.length() +1){
            return "";
        }
        return s.substring(start,start+min);
    }
}
