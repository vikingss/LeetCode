package round2;

import java.util.ArrayDeque;
import java.util.Deque;

public class No150 {
    public int evalRPN(String[] tokens) {
        if(tokens.length == 0) return 0;
        Deque<Integer> stack = new ArrayDeque<>();
        int i = 0;
        while(i < tokens.length){
            if(tokens[i].equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if(tokens[i].equals("-")) {
                stack.push( -stack.pop() + stack.pop());
            } else if(tokens[i].equals("*")){
                stack.push( stack.pop() * stack.pop());
            } else if(tokens[i].equals("/")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push( b / a);
            }else{
                stack.push(Integer.valueOf(tokens[i]));
            }
            i++;
        }
        return stack.pop();
    }
}
