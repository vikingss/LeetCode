package round2;

/**
 Input: [-2,1,-3,4,-1,2,1,-5,4],
 Output: 6
 Explanation: [4,-1,2,1] has the largest sum = 6.
 */
public class No53 {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int curSum = 0;
        for(int i = 0; i < nums.length; ++i){
            curSum = Math.max(curSum + nums[i],nums[i]);
            max = Math.max(max,curSum);
        }
        return max;
    }
}
