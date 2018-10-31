package round3;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 10:25 2018/10/31
 * @Modified By:
 */
public class No71 {
    public String simplifyPath(String path) {
        Deque<String> stack = new ArrayDeque<>();
        List<String> skip = Arrays.asList(".","..","");
        for(String dir: path.split("/")){
            if(dir.equals("..") && !stack.isEmpty()) stack.pop();
            else if(!skip.contains(dir)) stack.push(dir);
        }
        StringBuilder sb = new StringBuilder();
        for(String str:stack) sb.insert(0,"/" + str);
        return sb.length() == 0 ? "/" : sb.toString();
    }
}
