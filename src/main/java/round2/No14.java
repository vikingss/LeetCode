package round2;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 14:18 2018/10/8
 * @Modified By:
 */
public class No14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        String pre = strs[0];
        for(int i = 1;i < strs.length; ++i){
            pre = common(pre,strs[i]);
        }
        return pre;
    }

    private String common(String pre, String str) {
        if(pre.equals("")) return pre;
        int len = pre.length() < str.length() ? pre.length(): str.length();
        for(int i = 0; i < len; ++i){
            if(pre.charAt(i) != str.charAt(i)){
                return pre.substring(0,i);
            }
        }
        return len == pre.length() ? pre : str;
    }
}
