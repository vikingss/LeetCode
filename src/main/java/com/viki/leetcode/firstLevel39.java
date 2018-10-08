package com.viki.leetcode;

import java.util.Queue;
import java.util.Stack;

/**

 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

 有效字符串需满足：

 左括号必须用相同类型的右括号闭合。
 左括号必须以正确的顺序闭合。
 注意空字符串可被认为是有效字符串。

 示例 1:

 输入: "()"
 输出: true
 示例 2:

 输入: "()[]{}"
 输出: true
 示例 3:

 输入: "(]"
 输出: false
 示例 4:

 输入: "([)]"
 输出: false
 示例 5:

 输入: "{[]}"
 输出: true
 */
public class firstLevel39 {
    boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); ++i){

            if(stack.empty() || s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')' && stack.peek() ==  '('
                || s.charAt(i) == ']' && stack.peek() == '['
                || s.charAt(i) == '}' && stack.peek() == '{'){
                stack.pop();
            }else if(s.charAt(i) == ')' && stack.peek() !=  '('
                || s.charAt(i) == ']' && stack.peek() != '['
                || s.charAt(i) == '}' && stack.peek() != '{'){
                return false;

            }

        }
        return stack.empty() ? true : false;
    }
}
