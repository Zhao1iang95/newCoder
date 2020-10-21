package leetCodeGroup.twolookup;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 寻找比目标字母大的最小字母
 * @create : 2020/08/24 10:45
 */
public class LeetCode744 {
    //给你一个排序后的字符列表 letters ，列表中只包含小写英文字母。另给出一个目标字母 target，请你寻找在这一有序列表里比目标字母大的最小字母。
    //
    //在比较时，字母是依序循环出现的。举个例子：
    //
    //如果目标字母 target = 'z' 并且字符列表为 letters = ['a', 'b']，则答案返回 'a'
    public char nextGreatestLetter(char[] letters,char target){
        int n = letters.length;
        int l = 0,h = n-1;
        while (l <=n){
            int m = l + (h-l)/2;
            if(letters[m]<=target){
                l = m+1;
            }else {
                h = m-1;
            }
        }
        return l< n?letters[l]:letters[0];
    }
}
