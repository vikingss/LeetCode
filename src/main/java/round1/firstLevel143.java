package round1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 15:20 2018/8/20
 * @Modified By:
 */
public class firstLevel143 {
    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {

        Set<String> wordSet = new HashSet<>(wordList);
        Set<String> visited = new HashSet<>();
        visited.add(beginWord);
        int dist = 1;

        while (!visited.contains(endWord)) {
            Set<String> temp = new HashSet<>();
            for (String word: visited) {
                for (int i = 0; i < word.length(); i++) {
                    char[] chars = word.toCharArray();
                    for (int j = (int)'a'; j < (int)'z' + 1; j++) {
                        chars[i] = (char)j;
                        String newWord = new String(chars);
                        if (wordSet.contains(newWord)) {
                            temp.add(newWord);
                            wordSet.remove(newWord);
                        }
                    }
                }
            }
            dist += 1;
            if (temp.size() == 0) { // it never get to the endWord
                return 0;
            }

            visited = temp;
        }

        return dist;
    }


    public static void main(String[] args) {
        String[] list = {"hot","dot","dog","lot","log","cog"};
        ArrayList<String> wordList = new ArrayList<String>();
        wordList.add(list[0]);
        wordList.add(list[1]);
        wordList.add(list[2]);
        wordList.add(list[3]);
        wordList.add(list[4]);
        wordList.add(list[5]);
        ladderLength("hit",wordList.get(wordList.size()-1),wordList);
    }
}
