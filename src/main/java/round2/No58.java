package round2;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 17:06 2018/10/11
 * @Modified By:
 */
public class No58 {
    public int lengthOfLastWord(String s) {
        String use = s.trim();
        int cnt = 0;
        for(int i = use.length() -1 ; i >= 0; i--){
            if(use.charAt(i) != ' ') cnt++;
            else break;
        }
        return cnt;
    }
}
