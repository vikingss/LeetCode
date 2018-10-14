package round2;

import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 09:33 2018/10/14
 * @Modified By:
 */
public class No71 {
    public String simplifyPath(String path) {
        Deque<String> stack = new LinkedList<>();
        Set<String> skip = new HashSet<>(Arrays.asList("..",".",""));
        for(String dir:path.split("/")){
            if(dir.equals("..") && !stack.isEmpty()) stack.pop();
            else if(!skip.contains(dir)) stack.push(dir);
        }
        String res = "";
        for(String dir:stack) res = "/" + dir + res;
        return res.isEmpty() ? "/" : res;
    }
}
