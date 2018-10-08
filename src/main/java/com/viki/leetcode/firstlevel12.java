package com.viki.leetcode;

/**

 请编写一个函数，其功能是将输入的字符串反转过来。

 示例：

 输入：s = "hello"
 返回："olleh"
 */
public class firstlevel12  {
    public String reverseString(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; --i){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
