package round2;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 08:58 2018/10/7
 * @Modified By:
 */
public class No6 {
    public String convert(String s, int numRows) {
        if(s == null || s.length() == 0 || numRows == 1) return s;
        StringBuilder[] sb = new StringBuilder[numRows];
        for(int i = 0; i < numRows; ++i) {
            sb[i] = new StringBuilder("");
        }
        for(int i = 0; i < s.length(); ++i){
            int index = i % (2 * numRows - 2);
            if(index >= numRows) index = 2 * numRows - 2 - index;
            sb[index].append(s.charAt(i));
        }
        StringBuilder result = new StringBuilder();
        for(int i = 0;i < numRows; ++i){
            result.append(sb[i].toString());
        }
        return result.toString();
    }
}
