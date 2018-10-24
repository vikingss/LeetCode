package round2;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 17:01 2018/10/23
 * @Modified By:
 */
public class No171 {
    public static int titleToNumber(String s) {
        if(s == null || s.length() == 0) return 0;
        int res = 0;
        for(int i = 0; i < s.length(); ++i){
            res = res * 26 + s.charAt(i) - 'A' + 1;
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "Z";
        System.out.println(titleToNumber(s));
    }
}
