package SFOffer;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 第一个只出现一次的字符位置
 * @create : 2020/10/02 09:15
 */
public class Test50 {
    //在一个字符串中找到第一个只出现一次的字符，并返回它的位置。
    public int FirstNotRepeatingChar(String str){
        int[] cnts = new int[256];
        for (int i = 0; i <str.length() ; i++) {
            cnts[str.charAt(i)]++;
        }
        for (int i = 0; i <str.length() ; i++) {
            if (cnts[str.charAt(i)] == 1){
                return i;
            }
        }
        return -1;
    }
}
