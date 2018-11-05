package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:14 2018/11/5
 * @Modified By:
 */
public class No152 {
    public static int maxProduct(int[] nums) {
        if(nums.length == 0) return 0;
        int product = nums[0];
        int preMin = nums[0];
        int preMax  = nums[0];
//        int max = nums[0];
        for(int i = 1; i < nums.length; ++i){
            int maxCur = Math.max(Math.max(preMax * nums[i],preMin * nums[i]),nums[i]);
            int minCur = Math.min(Math.min(preMax * nums[i],preMin * nums[i]),nums[i]);
            product = Math.max(product,maxCur);
            preMax = maxCur;
            preMin = minCur;
        }
        return product;
    }

    public static void main(String[] args) {
        int[] nums = {-2,0,-1};
        System.out.println(maxProduct(nums));
    }
}
