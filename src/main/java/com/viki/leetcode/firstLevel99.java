package com.viki.leetcode;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 09:27 2018/7/13
 * @Modified By:
 */
public class firstLevel99 {

    public static int scoreOfParentheses(String S) {
        int score = 0;
        int param = 0;
        for (int i = 0; i < S.length(); ++i) {
            char ch = S.charAt(i);
            if (ch == '(') {
                param++;
            } else {
                param--;
            }
            if(ch == '(' && S.charAt(i + 1) == ')'){
                score += 1 << (param-1);
            }
        }
        return score;
    }

    public static void main(String[] args) {
        String S = "()()";
        System.out.println(scoreOfParentheses(S));
    }
}
