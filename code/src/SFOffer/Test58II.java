package SFOffer;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 左旋转字符串
 * @create : 2020/10/05 08:59
 */
public class Test58II {
    //
    public String LeftRotateString(String str,int n){
        if (n >=str.length())return str;
        char[] chars = str.toCharArray();
        reverse(chars,0,n-1);
        reverse(chars,n,str.length()-1);
        reverse(chars,0,str.length()-1);
        return new String(chars);
    }

    private void reverse(char[] chars, int i, int j) {
        while (i < j){
            swap(chars,i++,j--);
        }
    }
    private void  swap(char[] c,int i,int j){
        char t = c[i];
        c[i] = c[j];
        c[j] = t;
    }
}
