package round3;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 16:32 2018/10/29
 * @Modified By:
 */
public class No38 {
    public String countAndSay(int n) {
        if(n == 0) return "";
        if(n == 1) return "1";
        String str = countAndSay(n-1);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str.length()){
            char ch = str.charAt(i);
            int count = commonCnt(ch,i,str);
            sb.append(count).append(ch);
            i += count;
        }
        return sb.toString();
    }

    private int commonCnt(char ch, int pos, String str) {
        int res = 0;
        for(int i = pos; i < str.length(); ++i){
            if(ch == str.charAt(i)) res++;
            else break;
        }
        return res;
    }

}
