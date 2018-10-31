package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 10:16 2018/10/31
 * @Modified By:
 */
public class No70 {
    public int climbStairs(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;
        int[] res = new int[n+1];
        res[0] = 0;
        res[1] = 1;
        res[2] = 2;
        for(int i = 3; i <= n; ++i){
            res[i] = res[i-1] + res[i-2];
        }
        return res[n];
    }
}
