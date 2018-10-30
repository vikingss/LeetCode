package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 11:30 2018/10/30
 * @Modified By:
 */
public class No58 {
    public int lengthOfLastWord(String s) {
        if(s == null || s.length() == 0) return 0;
        String[] strs = s.split(" ");
        return strs.length == 0 ? 0 :strs[strs.length-1].length();
    }
}
