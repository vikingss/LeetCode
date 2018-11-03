package round3;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 09:51 2018/11/3
 * @Modified By:
 */
public class No150 {
    public int evalRPN(String[] tokens) {
        if(tokens == null || tokens.length == 0) return 0;
        Deque<Integer> stack = new ArrayDeque<>();
        int sum = 0;
        for(int i = 0; i < tokens.length; ++i){
            if(tokens[i].equals("+")){
                sum = stack.pop() + stack.pop();
                stack.push(sum);
            }else if(tokens[i].equals("-")){
                sum = -(stack.pop() - stack.pop());
                stack.push(sum);
            }else if(tokens[i].equals("*")){
                sum = stack.pop() * stack.pop();
                stack.push(sum);
            }else if(tokens[i].equals("/")){
                int a = stack.pop();
                int b = stack.pop();
                sum = b / a;
                stack.push(sum);
            }else {
                stack.push(Integer.valueOf(tokens[i]));
            }
        }
        return stack.pop();
    }
}
