package round4;



/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 16:40 2019/1/24
 * @Modified By:
 */
public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int[] res = new int[digits.length];
        int curry = 0;
        for(int i = digits.length - 1; i >= 0; i--){
            int tmp = i == digits.length - 1 ? digits[i] + 1 + curry : digits[i] + curry;
            curry = tmp / 10;
            res[i] = tmp % 10;
        }
        if(curry > 0) {
            int[] res2 = new int[digits.length+1];
            res2[0] = 1;
            return res2;
        }else return res;
    }

    public static void main(String[] args) {
        int[] nums = {8,9,9,9};
        plusOne(nums);
    }
}
