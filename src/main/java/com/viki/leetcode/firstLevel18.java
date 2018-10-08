package com.viki.leetcode;


/**
 * 实现 strStr() 函数。
 *
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 *
 * 示例 1:
 *
 * 输入: haystack = "hello", needle = "ll" 输出: 2 示例 2:
 *
 * 输入: haystack = "aaaaa", needle = "bba" 输出: -1 说明:
 *
 * 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
 *
 * 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符
 */
public class firstLevel18 {

    //暴力求解法
    public static int strStr(String haystack, String needle) {
        if (haystack == null) {
            return -1;
        }
        if (needle == null) {
            return 0;
        }
        if (needle.trim().length() == 0) {
            return 0;
        }
        for (int i = 0; i < haystack.length(); ++i) {
            if (tryMatch(haystack, needle, i)) {
                return i;
            }
        }
        return -1;

    }

    private static boolean tryMatch(String haystack, String needle, int pos) {
        if (haystack.substring(pos).length() < needle.length()) {
            return false;
        }
        for (int i = 0; i < needle.length(); ++i) {
            if (needle.charAt(i) != haystack.charAt(pos)) {
                return false;
            }
            pos++;
        }
        return true;

    }

    //KMP算法
    public static int strStr1(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        if (haystack.length() < needle.length()) {
            return -1;
        }
        int[] next = new int[needle.length()];
        getNextArr(next, needle);

        int i = 0, j = 0;
        while (i < haystack.length() && j < needle.length()) {
            if (j == -1 || haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            } else {
                j = next[j];
            }
        }
        return j == needle.length() ? i - j : -1;
    }

    public static void getNextArr(int[] next, String needle) {
        int k = -1, j = 0;
        next[0] = -1;
        while (j < needle.length() - 1) {
            if (k == -1 || needle.charAt(j) == needle.charAt(k)) {
                k++;
                j++;
                next[j] = k;
            } else {
                k = next[k];
            }
        }

    }

    public static void main(String[] args) {
        String hatstack = "mississippi";
        String needle = "issip";
        System.out.println(firstLevel18.strStr1(hatstack, needle));
    }
}
