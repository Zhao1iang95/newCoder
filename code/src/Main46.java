/**
 * @desc 把数字翻译成字符串
 * @author zhaoliang
 * @date 20200413
 */
public class Main46 {
    public static void main(String[] args) {

        String ans = String.valueOf(12258);

        System.out.println(getTranslationCount(ans));
    }
    private static int getTranslationCount(String ans) {
        //字符串的长度
        int length = ans.length();
        //new一个长度一样的数组
        int [] counts =new int[length];

        int count;
        //从下往上避免重复子问题
        for (int i=length-1;i>=0;i--){

            if (i<length-1){
                count = counts[i+1];

            }else {
                count = 1;
            }
            if (i<length-1){
                //例如拿到5
                int digit1= ans.charAt(1)-'0';
                //例如拿到8
                int digit2 = ans.charAt(i+1) -'0';
                //例如58
                int converted =digit1*10+digit2;
                if(converted>=10 && converted<=25){
                    if (i<length-2){
                        count+=counts[i+2];
                    }else {
                        count+=1;
                    }
                }
            }
            counts[i] = count;
        }
        count = counts[0];
        return count;
    }

}
