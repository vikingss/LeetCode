package com.viki.leetcode;

/**
 Count the number of prime numbers less than a non-negative number, n.

 Example:

 Input: 10
 Output: 4
 Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
 */
public class firstLevel76 {
    public static int countPrimes(int n) {
        int[] mark = new int[n];
        mark[2] = 0;
        for(int i = 3; i < n; ++i){
            if(i % 2 == 0){
                mark[i] = 1;
            }
        }

        for(int i = 3; i < n; i += 2){
            if(mark[i] == 0){
                if(i * i > n){
                    break;
                }

                for(int j = 2; i * j < n; ++j){
                    mark[i*j] = 1;
                }
            }
        }
        int cnt = 0;
        for(int i = 2; i < n; ++i){
            if(mark[i] == 0){
                cnt++;
            }
        }

        return cnt;
    }


    public static void main(String[] args) {
        int n = 100;
        System.out.println(firstLevel76.countPrimes(n));
    }

}
