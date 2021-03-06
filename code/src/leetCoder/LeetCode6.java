package leetCoder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : Z字形变换
 * @create : 2020/06/03 08:54
 */
public class LeetCode6 {
    //
    public String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }
        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i <Math.min(s.length(),numRows) ; i++) {
            rows.add(new StringBuilder());
        }
        int curRow = 0;

        boolean goDown = false;

        for (char c:s.toCharArray()) {
            rows.get(curRow).append(c);
            if (curRow == 0 || curRow == numRows - 1){
                goDown = !goDown;
            }
            curRow += goDown ? 1:-1;
        }
        StringBuilder ret = new StringBuilder();
        for (StringBuilder row: rows) {
            ret.append(row);
        }
       return ret.toString();
    }
}
