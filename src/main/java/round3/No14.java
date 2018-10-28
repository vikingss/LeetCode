package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 21:58 2018/10/28
 * @Modified By:
 */
public class No14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        String pre = strs[0];
        for(int i = 1; i < strs.length; ++i){
            pre = common(pre,strs[i]);
        }
        return pre;
    }

    private String common(String pre, String str) {
        int len = pre.length() < str.length() ? pre.length():str.length();
        for(int i = 0; i < len; ++i){
            if(pre.charAt(i) != str.charAt(i)) return pre.substring(0,i);
        }
        return len == pre.length() ? pre : str;
    }
}
