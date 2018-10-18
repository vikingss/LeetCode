package round2;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:16 2018/10/18
 * @Modified By:
 */
public class No122 {

    public int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 1; i < prices.length; ++i) {
            if(prices[i] > prices[i-1]) res += prices[i] - prices[i-1];
        }
        return res;
    }
}
