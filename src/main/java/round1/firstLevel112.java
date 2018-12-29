package round1;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 09:37 2018/7/17
 * @Modified By:
 */
public class firstLevel112 {

    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {

            n = -n;
            x = 1 / x;
        }
        return n % 2 == 0 ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);
    }
    public static void main(String[] args) {
        double x = 3;
        int n = 6;
        System.out.println(myPow(x, n));
    }
}
