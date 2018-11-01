package round2;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:48 2018/10/16
 * @Modified By:
 */
public class No91 {
    public static int numDecodings(String s) {
        if(s == null || s.length() == 0) return 0;
        int[]  dp = new int[s.length()+1];
        dp[0] = 1;//代表空字符串有一种decode way
        dp[1] = s.charAt(0) != '0' ? 1 : 0;//有一个数字字符的字符串
        for(int i = 2; i <= s.length(); ++i){
            int first = Integer.valueOf(s.substring(i-1,i));
            int second = Integer.valueOf(s.substring(i-2,i));
            if(first >= 1 && first <= 9) dp[i] += dp[i-1];
            if(second >= 10 && second <= 26) dp[i] += dp[i-2];
        }
        return dp[s.length()];
    }

    public static void main(String[] args) {
        String s = "12";
        System.out.println(numDecodings(s));
    }
}
