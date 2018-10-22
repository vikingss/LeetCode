package round2;

public class No152 {
    public int maxProduct(int[] nums) {
       int preMax = nums[0];
       int preMin = nums[0];
       int max = nums[0];
       for(int i = 1; i < nums.length; ++i){
           int maxCur = Math.max(Math.max(preMax * nums[i],preMin * nums[i]),nums[i]);
           int minCur = Math.min(Math.min(preMax * nums[i],preMin * nums[i]),nums[i]);
           max = Math.max(max,maxCur);
           preMax = maxCur;
           preMin = minCur;
       }
       return max;
    }
}
