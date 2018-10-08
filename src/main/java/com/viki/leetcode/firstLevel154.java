package com.viki.leetcode;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:57 2018/9/29
 * @Modified By:
 */
public class firstLevel154 {
    public int maxProduct(int[] nums) {
        // initialize maxToCur, minToCur and maxProduct
        // maxTocur = max(maxToCur * cur, minToCur * cur, cur)
        // minToCur = min(maxToCur * cur, minToCur * cur, cur)
        // maxProdcut = max(maxProduct, maxToCur)
        // return maxProduct
        int preMax = nums[0];
        int preMin = nums[0];
        int maxProduct = nums[0];
        for(int i = 0; i < nums.length; ++i){
            int maxToCur = Math.max(Math.max(preMax * nums[i],preMin * nums[i]),nums[i]);
            int minToCur = Math.min(Math.min(preMax * nums[i],preMin * nums[i]),nums[i]);
            maxProduct = Math.max(maxProduct,maxToCur);
            preMax = maxToCur;
            preMin = minToCur;
        }
        return maxProduct;
    }

}
