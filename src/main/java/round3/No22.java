package round3;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 09:26 2018/10/29
 * @Modified By:
 */
public class No22 {
    public List<String> generateParenthesis(int n) {
        List<String> resList = new ArrayList<>();
        dfs(resList,"",0,0,n);
        return resList;
    }

    private void dfs(List<String> resList, String s, int open, int close, int n) {
        if(s.length() == n * 2){
            resList.add(s);
            return;
        }
        if(open < n){
            dfs(resList,s+"(",open+1,close,n);
        }
        if(close < open){
            dfs(resList, s+")",open,close,n);
        }
    }
}
