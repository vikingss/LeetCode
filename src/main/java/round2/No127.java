package round2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:44 2018/10/18
 * @Modified By:
 */
public class No127 {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);
        Set<String> visited = new HashSet<>();
        int dist = 1;
        visited.add(beginWord);
        while (!visited.contains(endWord)) {
            Set<String> tmp = new HashSet<>();
            for (String str : visited) {
                for (int i = 0; i < str.length(); ++i) {
                    char[] chars = str.toCharArray();
                    for (int j = (int) 'a'; j < (int) 'z' + 1; ++j) {
                        chars[i] = (char) j;
                        String newWord = new String(chars);
                        if (wordSet.contains(newWord)) {
                            tmp.add(newWord);
                            wordSet.remove(newWord);
                        }
                    }
                }
            }
            dist++;
            if (tmp.size() == 0) {
                return 0;//// it never get to the endWord
            }
            visited = tmp;
        }
        return dist;
    }
}
