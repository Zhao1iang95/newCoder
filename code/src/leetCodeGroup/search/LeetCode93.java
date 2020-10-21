package leetCodeGroup.search;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 复原IP地址
 * @create : 2020/09/07 08:44
 */
public class LeetCode93 {
    //给定一个只包含数字的字符串，复原它并返回所有可能的 IP 地址格式。
    //
    //有效的 IP 地址 正好由四个整数（每个整数位于 0 到 255 之间组成，且不能含有前导 0），整数之间用 '.' 分隔。
    //
    //例如："0.1.2.201" 和 "192.168.1.1" 是 有效的 IP 地址，但是 "0.011.255.245"、"192.168.1.312" 和 "192.168@1.1" 是 无效的 IP 地址。
    public List<String> restoreIpAddresses(String s){
        List<String> res = new ArrayList<>();
        StringBuilder tempAddress = new StringBuilder();
        dfs(0,res,tempAddress,s);
        return res;
    }

    private void dfs(int k, List<String> res, StringBuilder tempAddress, String s) {
        if (k == 4 || s.length() ==0){
            if(k == 4 && s.length()==0){
                res.add(tempAddress.toString());
            }
            return;
        }
        for (int i = 0; i <s.length() && i <=2 ; i++) {
            if (i!=0 && s.charAt(0) == '0'){
                break;
            }
            String part = s.substring(0,i +1);
            if (Integer.valueOf(part)<=255){
                if (tempAddress.length()!=0){
                    part = "."+part;
                }
            tempAddress.append(part);
                dfs(k+1,res,tempAddress,s.substring(i+1));
                tempAddress.delete(tempAddress.length() - part.length(),tempAddress.length());
            }
        }
    }
}
