package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 11:14 2018/11/2
 * @Modified By:
 */
public class No122 {
    public int maxProfit(int[] prices) {//可多次操作
        if(prices.length == 0) return 0;
        int max = 0;
        for(int i = 1; i < prices.length; ++i){
            if(prices[i] > prices[i-1]) max += prices[i] - prices[i-1];
        }
        return max;
    }
}
