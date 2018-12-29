package round1;

/**
 for example, if we want to calc (17/2)

 ret = 0;

 17-2 ,ret+=1; left=15

 15-4 ,ret+=2; left=11

 11-8 ,ret+=4; left=3

 3-2 ,ret+=1; left=1

 ret=8;
 */
public class firstLevel107 {
    public static int divide(int dividend, int divisor) {
        int flag = (dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0) ? -1 : 1;
        if(divisor == 0) return Integer.MAX_VALUE;
        long ldividend = Math.abs((long)dividend);
        long ldivisor = Math.abs((long)divisor);
        long cur = 1,ret = 0,sub = ldivisor;
        while(ldividend >= ldivisor){
            if(ldividend >= sub){
                ret += cur;
                ldividend -= sub;
                sub = sub << 1;
                cur = cur << 1;
            }else{
                sub = sub >> 1;
                cur = cur >> 1;
            }

        }
        ret = flag == -1 ? -ret : ret;
        return (int) (ret > Integer.MAX_VALUE || ret < Integer.MIN_VALUE ? Integer.MAX_VALUE : ret);

    }

    public static void main(String[] args) {
        int a = Integer.MIN_VALUE,b = -1;
        System.out.println(divide(a,b));
    }
}
