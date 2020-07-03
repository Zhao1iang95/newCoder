import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * @author zhaoliang
 * @date 20200409
 * @desc 字符串的排列
 */
public class Main38 {
    //输入一个字符串，打印出该字符串中字符的所有排列。
    //你可以以任意顺序返回这个字符串数组，但里面不能有重复元素。
    public ArrayList<String> Permutation(String str){
        char[] a = str.toCharArray();
        ArrayList<String> ans = new ArrayList<>();
        solve(ans,a,0,str.length());
        ans = new ArrayList<String>(new HashSet<>(ans));//去重
        Collections.sort(ans);
        return ans;
    }

    private String change(char[] a){
        StringBuilder res = new StringBuilder();
        for(char value:a){
            res.append(value);
        }
        return  res.toString();
    }
    private void solve(ArrayList<String> ans, char[] a, int index, int length) {
        if(index == length -1){
            String res = change(a);
            ans.add(res);
        }else {
            //确定index位置的字符
            for(int i=index;i<length;i++){
                char temp = a[i];
                a[i] = a[index];
                a[index] = temp;
                solve(ans,a,index,index+1);
                //消除交换字符的影响
                temp = a[i];
                a[i] = a[index];
                a[index] = temp;
            }
        }

    }

}

