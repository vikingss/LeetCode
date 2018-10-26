package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 17:29 2018/10/26
 * @Modified By:
 */
public class No9 {
    public boolean isPalindrome(int x) {
        int palindromeX = 0;
        int inputX = x;
        while(x>0){
            palindromeX = palindromeX*10 + (x % 10);
            x = x/10;
        }
        return palindromeX==inputX;
    }
}
