package SFOffer;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 从1～n整数出现1的次数
 * @create : 2020/09/30 08:48
 */
public class Test43hard {
// 求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
// 为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,但是对于后面问题他就没辙了。
// ACMer希望你们帮帮他,并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）。
    public int NumOf1(int n){
        if (n ==0)return 0;
        String str= String.valueOf(n);
        int len = str.length();
        if (len == 1)return 1;
        int res = (int)Math.pow(10,len-1);
        int firstNumber = n /res;
        int firstBit = firstNumber == 1 ?(n%res)+1:res;
        int otherBit = res/10 * firstNumber *(len-1);
        return firstBit + otherBit + NumOf1(n % res);
    }
}
