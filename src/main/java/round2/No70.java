package round2;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 11:08 2018/10/13
 * @Modified By:
 */
public class No70 {
    public int climbStairs(int n) {
        // if(n <= 0) return 0;
        if(n == 1) return 1;
        // if(n == 2) return 2;
        int[] fib = new int[n];
        fib[0] = 1;
        fib[1] = 2;
        for(int i = 2; i < n; ++i){
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib[n-1];
    }
}
