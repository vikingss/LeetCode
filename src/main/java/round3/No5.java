package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 16:03 2018/10/26
 * @Modified By:
 */
public class No5 {
    private int pos = 0;
    private int maxLen = 0;
    public String longestPalindrome(String s) {
        if(s.length() < 2 ) return s;
        for(int i = 0; i < s.length() - 1; ++i){
            extendPalindrome(s,i,i); //从i开始向两端扩展回文 奇数
            extendPalindrome(s,i,i+1);// 偶数
        }
        return s.substring(pos,pos + maxLen);
    }

    private void extendPalindrome(String s, int i, int j) {
        while( i  >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)){
            i--;
            j++;
        }
        //检查是否需更新位置
        if(j - i - 1 > maxLen){
            maxLen = j - i - 1;
            pos = i + 1;
        }
    }
}
