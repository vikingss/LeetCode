package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 16:35 2018/10/26
 * @Modified By:
 */
public class No6 {
    /*  p    i  (0,5) 6个一组 numrows = 4;
        a   l     numsRows  3 -> 4 sum = 2*numsRows-2
        y a       numsRows  4 -> 6 sum
        p
   */
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
