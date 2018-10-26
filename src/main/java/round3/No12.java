package round3;


/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 17:44 2018/10/26
 * @Modified By:
 */
/*
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
 */
public class No12 {
    public String intToRoman(int num) {
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] strs = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < values.length; ++i){
            while(values[i] <= num){
                sb.append(strs[i]);
                num -= values[i];
            }
        }
        return sb.toString();
    }
}
