package round2;

import java.util.HashMap;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:02 2018/10/24
 * @Modified By:
 */
public class No166 {
    public String fractionToDecimal(int numerator, int denominator) {
        if(numerator == 0) return "0";
        StringBuilder sb = new StringBuilder();
        if((numerator < 0 && denominator > 0) || (numerator> 0 && denominator < 0)) sb.append("-");
        //整数部分
        long rator =  Math.abs((long)(numerator));
        long den = Math.abs((long)denominator);
        sb.append( rator / den);
        long num = rator % den;
        if(num == 0) return sb.toString();

        sb.append(".");
        //小数部分
        HashMap<Long,Integer> map = new HashMap<>();
        map.put(num,sb.length());
        while(num != 0){
            num *= 10;
            sb.append(num / den);
            num %=  den;
            if(map.containsKey(num)){
                int index = map.get(num);
                sb.insert(index,"(");
                sb.append(")");
                break;
            }else{
                map.put(num,sb.length());
            }
        }
        return sb.toString();
    }
}
