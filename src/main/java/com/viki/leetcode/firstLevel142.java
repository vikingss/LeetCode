package com.viki.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 16:12 2018/8/6
 * @Modified By:
 */
public class firstLevel142 {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> resList = new ArrayList<>();
        if(rowIndex < 0){
            return resList;
        }
        if(rowIndex == 0){
            resList.add(1);
            return resList;
        }
        if(rowIndex == 1){
            resList.add(1);
            resList.add(1);
            return resList;
        }
        if(rowIndex >= 2){
            List<Integer> preList = getRow(rowIndex - 1);
            resList.add(1);
            for(int i = 0; i < preList.size()-1; ++i){
                resList.add(preList.get(i) + preList.get(i+1));
            }
            resList.add(1);
        }
        return resList;
    }

    public static void main(String[] args) {
        int row = 4;
        System.out.println(getRow(row));
    }
}
