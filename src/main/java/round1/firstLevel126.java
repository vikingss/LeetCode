package round1;

import java.util.ArrayList;
import java.util.List;

/**
 Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

 For example, given n = 3, a solution set is:

 [
 "((()))",
 "(()())",
 "(())()",
 "()(())",
 "()()()"
 ]
 */
public class firstLevel126 {
    public List<String> generateParenthesis(int n) {
        List<String> resList = new ArrayList<>();
        dfs(resList,"",0,0,n);
        return resList;
    }

    public void dfs(List<String> strList, String str,int open,int close,int n){
        if(str.length() == n * 2){
            strList.add(str);
            return;
        }
        if(open < n) dfs(strList,str+"(",open+1,close,n);
        if(close < open)dfs(strList,str+")",open,close+1,n);

    }
}
