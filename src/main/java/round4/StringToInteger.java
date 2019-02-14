package round4;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 14:54 2019/1/29
 * @Modified By:
 */
public class StringToInteger {
    public int myAtoi(String str) {
        if(str == null) return 0;
        str = str.trim();
        if(str.length() == 0) return 0;
        if(str.charAt(0) < '0' && str.charAt(0) > '9' && str.charAt(0) != '+' && str.charAt(0) != '-') return 0;
        boolean sign = true;
        long res = 0;
        for(int i = 0; i < str.length(); ++i){
            char ch = str.charAt(i);
            if(i == 0 && ch == '-'){
                sign = false;
            }else if(i == 0 && ch == '+'){
                sign = true;
            }else if(ch >= '0' && ch <= '9'){
                res = res * 10 + ch - '0';
                if(sign && res > Integer.MAX_VALUE) return Integer.MAX_VALUE;
                if(!sign && -res < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            }else break;
        }
        return sign == true ? (int) res : (int)-res;
    }
}
