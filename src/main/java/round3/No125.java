package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 11:19 2018/11/2
 * @Modified By:
 */
public class No125 {
    public static boolean isPalindrome(String s) {
        if(s == null ||  s.isEmpty()) return true;
        int i = 0,j =  s.length()-1;
        s = s.toLowerCase();
        while(i <  j){
            while(i < j && !Character.isLetterOrDigit(s.charAt(i))) i++;
            while(i < j && !Character.isLetterOrDigit(s.charAt(j))) j--;
            if(s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "0P";
        System.out.println(isPalindrome(s));
    }
}
