package round2;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 13:52 2018/10/8
 * @Modified By:
 */
public class No12 {
    public String intToRoman(int num) {
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] strs = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < values.length; ++i){
            while(num >= values[i]){
                sb.append(strs[i]);
                num -= values[i];
            }
        }
        return sb.toString();
    }
}
