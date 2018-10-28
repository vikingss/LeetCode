package round3;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 23:30 2018/10/28
 * @Modified By:
 */
public class No20 {
    public static boolean isValid(String s) {
        if(s == null || s.length() == 0) return true;
        Deque<Character> stack = new ArrayDeque<>();
        for(int i = 0; i < s.length(); ++i){
            char ch = s.charAt(i);
            if(ch == ')'){
                if(stack.isEmpty() || stack.pop() != '(') return false;
            }else if(ch == ']'){
                if(stack.isEmpty() || stack.pop() != '[') return false;
            }else if(ch == '}'){
                if(stack.isEmpty() || stack.pop() != '{') return false;
            }else stack.push(ch);
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "()";
        System.out.println(isValid(str));
    }
}
