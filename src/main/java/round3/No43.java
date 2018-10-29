package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 17:06 2018/10/29
 * @Modified By:
 */

public class No43 {
    public String multiply(String num1, String num2) {
        int[] res = new int[num1.length() + num2.length()];
        for(int i = num1.length() - 1; i >= 0; i--){
            for(int j = num2.length()-1; j >= 0; j--) {
                int product = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int tmp = product + res[i + j + 1] ;
                res[i + j + 1] = tmp % 10;
                res[i + j] += tmp / 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < res.length; ++i){
            if(!(sb.length() == 0 && res[i] == 0)) sb.append(res[i]);
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }


}
