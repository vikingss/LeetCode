package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 14:10 2018/11/6
 * @Modified By:
 */
public class No204 {
    public int countPrimes(int n) {
        if(n < 2) return 0;
        boolean[] isNoPrime = new boolean[n];
        int res = 0;
        for(int i = 2; i < n; ++i){
            if(!isNoPrime[i]) res++;
            for(int j = 2; i*j < n; ++j){
                isNoPrime[i*j] = true;
            }
        }
        return res;
    }
}
