package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 09:56 2018/10/30
 * @Modified By:
 */
public class No50 {
    public static double myPow(double x, int n) {
        if(n == 0) return 1;
        if(n < 0){
            if(n == Integer.MIN_VALUE){
                return (1/x) * myPow(x, n + 1);
            }
            x = 1/x;
            n = -n;
        }
        return n % 2 == 0 ? myPow(x*x,n / 2) : x * myPow(x*x,n/2);
    }

    public static void main(String[] args) {
        int a = Integer.MIN_VALUE;
        System.out.println(myPow(2.0,a));
    }

}
