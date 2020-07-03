/**
 * @desc 翻转字符串
 * @author zhaoliang
 * @date 20200419
 */
public class Main58 {
    //牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。
    // 同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，但却读不懂它的意思。
    // 例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，
    // 正确的句子应该是“I am a student.”。Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？

    public String ReverseSentence1(String str) {
        String flipStr = new StringBuilder(str).reverse().toString();//第一次翻转
        StringBuilder res = new StringBuilder();//用来遍历每一个单词
        StringBuilder ans = new StringBuilder();//用来保存结果
        for (int i = 0;i<flipStr.length();i++){
            if (flipStr.charAt(i) == ' '){
                ans.append(res.reverse().toString()).append(" ");
                res = new StringBuilder();
            }else {
                res.append(flipStr.charAt(i));
            }
        }
        ans.append(res.reverse().toString()); //最后那个单词的翻转结果保存到ans

        return ans.toString();
    }
public String ReverseSentence2(String str) {
    //无空格字符构成一个单词。
    //输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
    //如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
    String flipStr = new StringBuilder(str.trim()).reverse().toString();//第一次翻转
    StringBuilder res = new StringBuilder();//用来遍历每一个单词
    StringBuilder ans = new StringBuilder();//用来保存结果
    for (int i = 0;i<flipStr.length();i++){
        if (flipStr.charAt(i) == ' '){
            if (res.length() > 0){
                ans.append(ans.length() ==0 ? res.reverse() : " " +res.reverse());
                res = new StringBuilder();
            }
        }else {
            res.append(flipStr.charAt(i));
        }
    }
    if (res.length() > 0){
        ans.append(ans.length() ==0 ? res.reverse() : " " +res.reverse());
    }

    return ans.toString();
}
}
