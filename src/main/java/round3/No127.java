package round3;

import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 11:28 2018/11/2
 * @Modified By:
 */
public class No127 {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);
        Set<String> visited = new HashSet<>();
        int res = 1;
        visited.add(beginWord);
        while(!visited.contains(endWord)){
            Set<String> tmp = new HashSet<>();
            for(String str:visited){
                for(int i = 0; i< str.length();++i){
                    char[] chars = str.toCharArray();
                    for(int j = (int)'a'; j < (int)'z'+1; ++j){
                        char ch = (char)j;
                        chars[i] = ch;
                        String newS = new String(chars);
                        if(wordSet.contains(newS)){
                            tmp.add(newS);
                            wordSet.remove(newS);//回溯
                        }
                    }
                }
            }
            res++;
            if (tmp.size() == 0) {
                return 0;//// it never get to the endWord
            }
            visited = tmp;
        }
        return res;
    }
}
