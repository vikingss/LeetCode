package round4;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 17:13 2018/12/28
 * @Modified By:
 */
public class ZigZagConversion {
    public String convert(String s, int numRows) {
        if(s == null || s.length() == 0 || numRows <= 1) return s;
        StringBuilder[] sb = new StringBuilder[numRows];
        StringBuilder res = new StringBuilder();
        for(int i = 0; i  < numRows; ++i){
            sb[i] = new StringBuilder("");
        }
        for(int i = 0; i < s.length(); ++i){
            int index = i % (2 * numRows - 2);
            if(index >= numRows) index = 2 * numRows - 2 - index;
            sb[index].append(s.charAt(i));
        }
        for(int i = 0; i < sb.length; ++i){
            res.append(sb[i]);
        }
        return res.toString();
    }

    public static void main(String[] args) {

    }
}
