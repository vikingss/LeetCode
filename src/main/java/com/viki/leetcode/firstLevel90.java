package com.viki.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 16:36 2018/7/9
 * @Modified By:
 */
public class firstLevel90 {
    public String intToRoman(int num) {
        List<Integer> numList = new ArrayList<>();
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] strs = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < values.length; ++i){
            while(num  >= values[i]){
                sb.append(strs[i]);
                num -= values[i];
            }
        }
        return sb.toString();
    }
}
