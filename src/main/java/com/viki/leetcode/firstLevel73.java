package com.viki.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
 *
 * Strings consists of lowercase English letters only and the length of both strings s and p will
 * not be larger than 20,100.
 *
 * The order of output does not matter.
 *
 * Example 1:
 *
 * Input: s: "cbaebabacd" p: "abc"
 *
 * Output: [0, 6]
 *
 * Explanation: The substring with start index = 0 is "cba", which is an anagram of "abc". The
 * substring with start index = 6 is "bac", which is an anagram of "abc". Example 2:
 *
 * Input: s: "abab" p: "ab"
 *
 * Output: [0, 1, 2]
 *
 * Explanation: The substring with start index = 0 is "ab", which is an anagram of "ab". The
 * substring with start index = 1 is "ba", which is an anagram of "ab". The substring with start
 * index = 2 is "ab", which is an anagram of "ab".
 */
public class firstLevel73 {
    public static List<Integer> findAnagrams1(String s, String p) {
        List<Integer> resList = new ArrayList<>();
        int diffCnt = p.length();
        int left = 0,right = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < p.length(); ++i){
            if(map.containsKey(p.charAt(i))){
                map.put(p.charAt(i),map.get(p.charAt(i))+1);
            }else{
                map.put(p.charAt(i),1);
            }
        }

        for(right = 0; right < s.length(); ++right){
            if(map.containsKey(s.charAt(right))){
                map.put(s.charAt(right),map.get(s.charAt(right)) - 1);
                if(map.get(s.charAt(right)) == 0) {
                    diffCnt--;
                }
            }
            while(diffCnt == 0){
                if(map.containsKey(s.charAt(left))){
                    map.put(s.charAt(left),map.get(s.charAt(left)) + 1);
                    if(map.get(s.charAt(left)) > 0){
                        diffCnt++;
                    }
                }
                if(right - left == p.length() - 1){
                    resList.add(left);
                }

                left++;
            }
        }
        return resList;
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<Integer>();
        int NumberOfDeference = p.length();  //差异度指数
        int left = 0, right = 0;  //窗口左右指针
        int[] asciiChars = new int[256];//记录p中字符有哪些及其数量的数组
        for (int i = p.length() - 1; i >= 0; --i) {
            ++asciiChars[p.charAt(i)];
        } //记录完毕

        for (; right < s.length(); right++) { //滑动右窗口
            asciiChars[s.charAt(right)]--;  //在该字符相应位置减一
            if (asciiChars[s.charAt(right)] >= 0) {
                NumberOfDeference--;//如果加进来的那个在p中，NumberOfDeference减一
            }
            if (right - left == (p.length() - 1)) {
                //如果这时窗口大小为p.length()
                if (NumberOfDeference == 0) {
                    result.add(left);
                }
                //这时出现一次匹配，将左窗口加到result中
                //下面是滑动左窗口的操作
                if (asciiChars[s.charAt(left)] >= 0) {
                    NumberOfDeference++;//如果被踢出的那个在p中，NumberOfDeference加一
                }
                asciiChars[s.charAt(left)]++;//数组中相应字符计数位置加回来
                left++; //左窗口向右滑动
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(firstLevel73.findAnagrams1(s, p));
    }

}
