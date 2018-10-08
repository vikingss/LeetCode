package round2;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 09:06 2018/10/7
 * @Modified By:
 */
public class No7 {

    public static int reverse(int x) {
        if (x == 0) {
            return 0;
        }
        long result = 0L;
        while(x != 0){
            result = result * 10 + x % 10;
            x/= 10;
            if(result <= Integer.MIN_VALUE|| result >= Integer.MAX_VALUE){
                return 0;
            }
        }
        return (int)result;
    }


}
