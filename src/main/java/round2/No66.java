package round2;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 10:39 2018/10/13
 * @Modified By:
 */
public class No66 {
    public int[] plusOne(int[] digits) {
        boolean isAllNine = true;
        for(int i = 0; i < digits.length; ++i){
            if(digits[i] != 9){
                isAllNine = false;
                break;
            }
        }
        if(isAllNine){
            int[] res = new int[digits.length+1];
            res[0] = 1;
            return res;
        } else{
            int i = digits.length -1;
            int curry = 1;
            do {
                digits[i] += curry--;
                if(digits[i] >= 10) {
                    curry = 1;
                    digits[i] = 0;
                }
                i--;
            }while(curry > 0 && i >= 0);
            return digits;
        }
    }
}
