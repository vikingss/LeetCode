package round1;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 16:35 2018/7/6
 * @Modified By:
 */
public class firstLevel87 {
    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        for(int i = len - 1; i >= 0; --i) {
            if (digits[i] < 9) {
                ++digits[i];
                return digits;
            }
            digits[i] = 0;
        }

        int[] newNums = new int[len+1];
        newNums[0] = 1;
        return newNums;
    }

    public static void main(String[] args) {
        int[] digits = {1,2,3,4,5,9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
}
