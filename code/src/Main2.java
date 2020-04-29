/**
 * @author zhaoliang
 * @desc 替换空格
 * @date 20200427
 */
public class Main2 {
    //请实现一个函数，将一个字符串中的每个空格替换成“%20”。
    //例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
    public String replaceSpace(StringBuffer str) {
        if (str == null) {
            return null;
        }
        int len = str.length();
        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < len; i++) {

            if (str.charAt(i) == ' ') {
                stringBuffer.append("%20");
            } else {
                stringBuffer.append(str.charAt(i));
            }
        }
        return stringBuffer.toString();
    }
}
