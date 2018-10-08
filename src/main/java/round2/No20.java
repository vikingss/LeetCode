package round2;

import java.util.Stack;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 16:33 2018/10/8
 * @Modified By:
 */
public class No20 {
    public boolean isValid(String s) {
        if(s == null) return true;
        if(s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); ++i){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }else {
                if(stack.isEmpty()) return false;
                char pop = stack.pop();
                if(ch == ')' && pop != '(' || ch ==  ']' && pop != '[' || ch == '}' && pop != '{'){
                    return false;
                }
            }
        }
        if(!stack.isEmpty()) return false;
        return true;
    }
}
