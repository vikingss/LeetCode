package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 13:58 2018/11/1
 * @Modified By:
 */
public class No96 {
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            for(int j = 1;j <=i;++j){
                dp[i] += dp[j-1] * dp[i-j];
            }
        }
        return dp[n];

    }
}
