package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:38 2018/10/30
 * @Modified By:
 */
public class No66 {
    public int[] plusOne(int[] digits) {
        int curry = 0;
        for(int i = digits.length - 1;  i >= 0; i--){
            int tmp = 0;
            if(i == digits.length-1) {
                tmp = digits[i] + 1+curry;
            }else tmp = digits[i]+curry;
            curry =  tmp / 10;
            digits[i] = tmp % 10;
        }
        if(curry > 0){
            int[] res = new int[digits.length+1];
            res[0] = 1;
            return res;
        }
        return digits;
    }
}
