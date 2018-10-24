package round2;

public class No204 {
    public int countPrimes(int n) {
        if(n < 2) return 0;
        int res = 0;
        boolean[] isNoPrime = new boolean[n];
        for(int i = 2; i < n; ++i){
            if(!isNoPrime[i]) res++;
            for(int j = 2; i * j < n; ++j){
                isNoPrime[i*j] = true;
            }
        }
        return res;
    }
}
