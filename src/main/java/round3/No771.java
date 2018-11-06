package round3;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 14:36 2018/11/6
 * @Modified By:
 */
public class No771 {
    public int numJewelsInStones(String J, String S) {
        int res = 0;
        for(int i = 0; i < S.length(); ++i){
            if(J.contains(S.substring(i,i+1)))res++;
        }
        return res;
    }
}
