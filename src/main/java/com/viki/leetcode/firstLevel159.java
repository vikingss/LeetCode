package com.viki.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 14:15 2018/9/30
 * @Modified By:
 */
public class firstLevel159 {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegree = initInDegree(numCourses, prerequisites);
        List<List<Integer>> table = initTable(numCourses, prerequisites);
        for (int i = 0; i < numCourses; ++i) {
            int j = 0;
            for (; j < numCourses; ++j) {
                if (indegree[j] == 0) {
                    break;
                }
            }
            if (j == numCourses) {
                return false;
            }
            indegree[j] = -1;
            for (int k = 0; k < table.get(j).size(); ++k) {
                indegree[table.get(j).get(k)]--;
            }
        }
        return true;
    }

    private int[] initInDegree(int numCourses, int[][] prerequisites) {
        int[] res = new int[numCourses];
        for (int i = 0; i < numCourses; ++i) {
            res[i] = 0;
        }
        for (int i = 0; i < prerequisites.length; ++i) {
            res[prerequisites[i][0]]++;
        }
        return res;
    }

    private List<List<Integer>>  initTable(int numCourses, int[][] prerequisites) {
        List<List<Integer>>  resList = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            resList.add(new ArrayList<>());
        }
        for (int i = 0; i < prerequisites.length; i++) {
            resList.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        return resList;
    }

}
