package com.viki.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 *
 * 示例:
 *
 * 输入: 5 输出: [ [1], [1,1], [1,2,1], [1,3,3,1], [1,4,6,4,1] ]
 */
public class firstLevel53 {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> resList = new ArrayList<List<Integer>>();
        if (numRows == 0) {
            return resList;
        } else {
            List tmp =new ArrayList<Integer>();
            tmp.add(1);
            resList.add(tmp);
            for (int i = 1; i < numRows; ++i) {
                resList.add(generateList((ArrayList<Integer>) resList.get(i - 1)));
            }
        }
        return resList;
    }

    private static List<Integer> generateList(ArrayList<Integer> integers) {
        List<Integer> res = new ArrayList<Integer>();
        res.add(1);
        for (int i = 0; i < integers.size() - 1; ++i) {
            res.add(integers.get(i) + integers.get(i + 1));
        }
        res.add(1);
        return res;
    }

    public static void main(String[] args) {
        int n = 5;
        firstLevel53.generate(n);
    }

}
