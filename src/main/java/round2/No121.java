package round2;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:02 2018/10/18
 * @Modified By:
 */
public class No121 {
    public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;
        int min = Integer.MAX_VALUE;
        int[] sum = new int[prices.length];
        for(int i = 0; i < prices.length; ++i){
            min = prices[i] < min ? prices[i]: min;
            sum[i] = prices[i] - min;
        }
        int res = Integer.MIN_VALUE;
        for(int i = 0; i < sum.length; ++i){
            res = Math.max(res,sum[i]);
        }
        return res;
    }
}
