package round2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 17:42 2018/10/8
 * @Modified By:
 */
public class No22 {
    public List<String> generateParenthesis(int n) {
        List<String> resList = new ArrayList<>();
        dfs(resList,"",0,0,n);
        return resList;
    }

    private void dfs(List<String> resList, String str,int open, int close, int n) {
        if(str.length() == n * 2){
            resList.add(str);
            return;
        }
        if(open < n){
            dfs(resList,str+"(",open+1,close,n);
        }
        if(close < open){
            dfs(resList,str+")",open,close+1,n);
        }
    }
}
