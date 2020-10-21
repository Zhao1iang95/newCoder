package SFOffer;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 替换空格
 * @create : 2020/09/21 15:38
 */
public class Test5 {
    //请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
    public String replaceSpace(StringBuffer str){
        int P1 = str.length()-1;
        for (int i = 0; i <=P1 ; i++) {
            if(str.charAt(i) == ' '){
                str.append("  ");
            }
        }
        int P2 = str.length()-1;
        while(P1 >=0 && P2 >P1){
            char c = str.charAt(P1--);
            if (c == ' '){
                str.setCharAt(P2--,'0');
                str.setCharAt(P2--,'2');
                str.setCharAt(P2--,'%');
            }else{
                str.setCharAt(P2--,c);
            }
        }
        return str.toString();
    }
}
