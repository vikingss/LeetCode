package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 09:54 2018/11/6
 * @Modified By:
 */
public class No167 {
    public int[] twoSum(int[] numbers, int target) {
        int[] res =  new int[2];
        if(numbers.length == 0) return res;
        int i = 0,j  = numbers.length-1;
        while(i < j){
            if(numbers[i] + numbers[j] > target) j--;
            else  if(numbers[i] + numbers[j] < target) i++;
            else{
                res[0] = i+1;
                res[1] = j+1;
                return res;
            }
        }
        return res;
    }
}
