package round2;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:47 2018/10/24
 * @Modified By:
 */
public class No172 {
    public static int trailingZeroes(int n) {
        if(n < 5 ) return 0;
        int res = 0;
        while(n > 0){
            int k = n / 5;
            res += k;
            n = k;
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 25;
        System.out.println(trailingZeroes(n));
    }
}
