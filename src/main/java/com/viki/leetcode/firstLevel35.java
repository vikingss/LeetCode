package com.viki.leetcode;

/**
 统计所有小于非负整数 n 的质数的数量。

 示例:

 输入: 10
 输出: 4
 解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
 */
public class firstLevel35 {
    public int countPrimes(int n) {
        int count = 0;
        boolean[] isPrime = new boolean[n];

        for (int i = 2; i < n; ++i) {
            if (isPrime[i] == false) {
                count++;
                for (int j = 1; j * i < n; j++) {
                    isPrime[j*i] = true;
                }
            }

        }
        return count;
    }

}
