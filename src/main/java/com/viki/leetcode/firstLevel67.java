package com.viki.leetcode;

/**
 * 给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 *
 * J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
 *
 * 示例 1:
 *
 * 输入: J = "aA", S = "aAAbbbb" 输出: 3 示例 2:
 *
 * 输入: J = "z", S = "ZZ" 输出: 0 注意:
 *
 * S 和 J 最多含有50个字母。 J 中的字符不重复。
 */
public class firstLevel67 {

    public static int numJewelsInStones(String J, String S) {
        if(J.length() == 0 || S.length() == 0){
            return 0;
        }
        int cnt = 0;
        int i = 0;
        while (i < S.length()) {
            if (isJewel(J, S, i)) {
                cnt++;
            }
            i ++;
        }
        return cnt;
    }

    private static boolean isJewel(String str, String s, int pos) {

        for(int i =  0;i < str.length(); ++i){
            if(s.charAt(pos) == str.charAt(i)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String J = "dbca";
        String S = "beb";
        System.out.println(firstLevel67.numJewelsInStones(J,S));
    }

}
