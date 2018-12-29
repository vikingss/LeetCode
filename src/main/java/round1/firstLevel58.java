package round1;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 12:27 2018/6/24
 * @Modified By:
 */
public class firstLevel58 {
    public static int arrangeCoins(int n) {
        if(n == 0){
            return 0;
        }
        long l = 1,h = n;
        while(l <= h){
            long mid = (l + h) / 2;
            if(mid * (mid + 1) / 2 <= n && (mid + 1) * (mid + 2) / 2 > n){
                return (int) mid;
            }else if((mid + 1) * (mid + 2) / 2 == n){
                return (int) (mid + 1);
            }
            else if(mid * (mid + 1) / 2 > n){
                h = mid - 1;
            }else {
                l = mid + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(firstLevel58.arrangeCoins(n));
    }
}
