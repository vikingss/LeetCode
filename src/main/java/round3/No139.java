package round3;

import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 16:07 2018/11/2
 * @Modified By:
 */
public class No139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        if(s == null || s.length() == 0) return false;
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;
        for(int i = 1; i < s.length()+1; ++i){
            for(int j = 0; j < i; ++j){
                if(dp[j] && wordDict.contains(s.substring(j,i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
