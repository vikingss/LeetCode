package round1;

import java.util.ArrayList;
import java.util.List;

/**
 给定 S 和 T 两个字符串，当它们分别被输入到空白的文本编辑器后，判断二者是否相等，并返回结果。 # 代表退格字符。



 示例 1：

 输入：S = "ab#c", T = "ad#c"
 输出：true
 解释：S 和 T 都会变成 “ac”。
 示例 2：

 输入：S = "ab##", T = "c#d#"
 输出：true
 解释：S 和 T 都会变成 “”。
 示例 3：

 输入：S = "a##c", T = "#a#c"
 输出：true
 解释：S 和 T 都会变成 “c”。
 示例 4：

 输入：S = "a#c", T = "b"
 输出：false
 解释：S 会变成 “c”，但 T 仍然是 “b”。


 提示：

 1 <= S.length <= 200
 1 <= T.length <= 200
 S 和 T 只含有小写字母以及字符 '#'。
 */
public class firstLevel62 {
    public static boolean backspaceCompare(String S, String T) {
        S = backspace(S);
        T = backspace(T);
        return S.equals(T);
    }

    private static String backspace(String t) {
        List<Character> tmp = new ArrayList<Character>();
        for(int i = 0;i  < t.length(); ++i){
            if(t.charAt(i) == '#' && !tmp.isEmpty()){
                tmp.remove(tmp.size() - 1);
            }else if(t.charAt(i) != '#'){
                tmp.add(t.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < tmp.size(); ++i){
            sb.append(tmp.get(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "y#fo##f";
        String t = "y#f#o##f";
        System.out.println(firstLevel62.backspaceCompare(s,t));
    }
}
