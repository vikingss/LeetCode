package com.viki.leetcode;

/**
 报数序列是指一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：

 1.     1
 2.     11
 3.     21
 4.     1211
 5.     111221
 1 被读作  "one 1"  ("一个一") , 即 11。
 11 被读作 "two 1s" ("两个一"）, 即 21。
 21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。

 给定一个正整数 n ，输出报数序列的第 n 项。

 注意：整数顺序将表示为一个字符串。

 示例 1:

 输入: 1
 输出: "1"
 示例 2:

 输入: 4
 输出: "1211"
 */
public class firstLevel19 {
    public static String countAndSay(int n) {
        if(n == 1){
            return "1";
        }
        String str = countAndSay(n - 1);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(i < str.length()){
            int count = countCommon(str,i);//charAt(i)的连续相同字符几个
            sb.append(count).append(str.charAt(i));
            i = i + count;
        }
        return sb.toString();
    }

    private static int countCommon(String str, int pos) {
        if(pos >= str.length()){
            return 0;
        }
        int count = 0;
        for(int i = pos; i < str.length(); ++i){
            if(str.charAt(i) == str.charAt(pos)){
                count++;
            }else{
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(firstLevel19.countAndSay(8));
    }
}
