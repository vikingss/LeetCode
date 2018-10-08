package round2;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 10:03 2018/10/7
 * @Modified By:
 */
public class No9 {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        String s = String.valueOf(x);
        int i = 0,j = s.length()-1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
