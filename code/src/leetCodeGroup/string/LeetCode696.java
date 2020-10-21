package leetCodeGroup.string;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 计数二进制子串
 * @create : 2020/08/05 11:14
 */
public class LeetCode696 {
    //给定一个字符串 s，计算具有相同数量0和1的非空(连续)子字符串的数量，
    // 并且这些子字符串中的所有0和所有1都是组合在一起的。
    //
    //重复出现的子串要计算它们出现的次数。
    public int countBinarySubstrings(String s){
        int preLen =0, curLen=1,count=0;
        for (int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                curLen++;
            }else {
                preLen = curLen;
                curLen=1;
            }
            if(preLen>=curLen){
                count++;
            }
        }
        return count;
    }
}
