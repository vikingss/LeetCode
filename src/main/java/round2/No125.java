package round2;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:20 2018/10/18
 * @Modified By:
 */
public class No125 {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int head = 0, tail = s.length() - 1;
        char cHead, cTail;
        while(head <= tail) {
            cHead = s.charAt(head);
            cTail = s.charAt(tail);
            if (!Character.isLetterOrDigit(cHead)) head++;
            else if(!Character.isLetterOrDigit(cTail)) tail--;
            else {
                if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
                    return false;
                }
                head++;
                tail--;
            }
        }

        return true;
    }

}
