package round2;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:10 2018/10/10
 * @Modified By:
 */
public class No50 {
    public double myPow(double x, int n) {
        if(n == 0) return 1;
        if(n < 0){
            if(n == Integer.MIN_VALUE){
                return (1/x) * myPow(x,n+1);
            }
            x = 1/x;
            n = -n;
        }
        return n % 2 == 0 ? myPow(x*x,n / 2) : x * myPow(x*x,n/2);
    }
}
