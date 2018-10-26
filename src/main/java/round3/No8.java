package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 17:15 2018/10/26
 * @Modified By:
 */
public class No8 {
    public int myAtoi(String str) {
        if(str == null || str.length() == 0) return 0;
        str = str.trim();
        long res = 0;
        boolean flag = false;
        for(int i = 0; i < str.length(); ++i){
            char ch = str.charAt(i);
            if(i == 0 && ch == '+') flag = false;
            else if(i == 0 && ch == '-') flag = true;
            else if(ch >= '0' && ch <= '9') {
                res = res * 10 + ch - '0';
                if(!flag && res > Integer.MAX_VALUE) return Integer.MAX_VALUE;
                if(flag && -res < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            }
            else break;
        }
        return !flag ? (int)res : (int)-res;
    }
}
