package round2;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 10:46 2018/10/9
 * @Modified By:
 */
public class No28 {

    public int divide(int dividend, int divisor) {
        boolean isPositive = true;
        if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)) {
            isPositive = false;
        }

        long ldividend = Math.abs((long) dividend);
        long ldivisor = Math.abs((long) divisor);

        if (ldivisor == 0) {
            return Integer.MAX_VALUE;
        }
        if (ldividend == 0 || ldividend < ldivisor) {
            return 0;
        }

        long result = divide(ldividend, ldivisor);//就这句是在做除法，其他都是对边界值的处理
        if (result > Integer.MAX_VALUE) {
            return isPositive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        return (int) (isPositive ? result : -result);
    }

    private long divide(long ldividend, long ldivisor) {
        if(ldividend < ldivisor) return 0;
        long sum = ldivisor;
        long result = 1;
        while(ldividend >= (sum << 1)){//除数*2扩大到极致，继续递归
            sum = sum << 1;
            result =  result << 1;
        }
        return result + divide(ldividend - sum,ldivisor);
    }

}
