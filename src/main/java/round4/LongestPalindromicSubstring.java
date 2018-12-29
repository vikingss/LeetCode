package round4;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 19:58 2018/12/26
 * @Modified By:
 */
public class LongestPalindromicSubstring {
    private int pos = 0;//起始位置
    private int maxLen = 0;//偏移量
    public String longestPalindrome(String s) {
        if(s == null || s.length() == 0) return "";
        for(int i = 0; i < s.length(); ++i){
            //两种情况 奇数字符 和偶数字符
            extendPalindrom(s,i,i);
            extendPalindrom(s,i,i+1);
        }
        return s.substring(pos,pos + maxLen);
    }

    private void extendPalindrom(String s, int i, int j) {

        //如果满足回文条件就继续，直到不满足回文条件
        //先找到回文的中点，从中点向两边拓展
        while(i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)){
            i--;//此时i--后如果不满足，求pos的时候再向右移一位
            j++;
        }
        //判断这次回文计算是否比上一次的偏移量要大，如果大，就更新起始位置和偏移量
        if(j - i - 1 > maxLen){
            maxLen = j - i - 1;
            pos = i + 1;//i的位置是不满足的第一个位置，需要向右一位
        }

    }
}
