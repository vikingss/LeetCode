package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 11:03 2018/11/2
 * @Modified By:
 */
public class No121 {
    public int maxProfit(int[] prices) { //只能操作一次
        if(prices.length == 0) return 0;
        int min = prices[0];
        int max = 0;
        for(int i = 1; i < prices.length; ++i){
            max = Math.max(max,prices[i] - min);
            min = Math.min(min,prices[i]);
        }
        return max;
    }
}
