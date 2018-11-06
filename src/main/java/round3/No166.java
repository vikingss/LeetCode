package round3;

import java.util.HashMap;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 09:39 2018/11/6
 * @Modified By:
 */
public class No166 {
    public String fractionToDecimal(int numerator, int denominator) {
        //整数部分
        StringBuilder sb = new StringBuilder();
        if(numerator > 0 && denominator < 0 || numerator < 0 && denominator > 0) sb.append("-");
        long lnumerator = Math.abs((long)numerator);
        long ldenominator = Math.abs((long)denominator);
        sb.append(lnumerator / ldenominator);
        long num = lnumerator % ldenominator;
        if(num == 0) return sb.toString();

        //小数部分
        sb.append(".");
        HashMap<Long,Integer> map = new HashMap<>(); //num -> index;
        map.put(num,sb.length());
        while(num != 0){
            num = num * 10 ;
            sb.append(num / ldenominator);
            num %= ldenominator;
            if(map.containsKey(num)){
                int index = map.get(num);
                sb.insert(index,"(");
                sb.append(")");
                break;
            }else map.put(num,sb.length());
        }
        return sb.toString();
    }
}
