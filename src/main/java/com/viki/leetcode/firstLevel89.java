package com.viki.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 10:05 2018/7/7
 * @Modified By:
 */
public class firstLevel89 {
    public static int findComplement(int num) {
        List<Integer> bits = new ArrayList<>();
        while(num > 0){
            bits.add(num % 2);
            num /= 2;
        }
        List<Integer> resList = new ArrayList<>();
        for(int i = 0; i < bits.size(); ++i){
            resList.add(1 - bits.get(i));
        }

        int res = 0;
        for(int i = 0; i < resList.size(); ++i){
            int tmp = resList.get(i);
            if(tmp != 0){
                res += Math.pow(2,i);
            }
        }
        return res;
    }


    public static void main(String[] args) {
        int num = 3;
        System.out.println(findComplement(num));
    }
}
