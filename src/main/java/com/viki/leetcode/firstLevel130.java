package com.viki.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Input: candidates = [2,3,5], target = 8, A solution set is: [ [2,2,2,2], [2,3,3], [3,5] ]
 */
public class firstLevel130 {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> resList = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(resList, new ArrayList<>(), candidates, target, 0);
        return resList;
    }

    private static void backtrack(List<List<Integer>> resList, ArrayList tmpList, int[] candidates,
        int remain, int start) {
        if (remain < 0) {
            return;
        }
        if (remain == 0) {
            resList.add(new ArrayList<>(tmpList));
        } else {
            for (int i = start; i < candidates.length; ++i) {
                tmpList.add(candidates[i]);
                backtrack(resList, tmpList, candidates, remain - candidates[i], i);
                tmpList.remove(tmpList.size() - 1);
            }
        }

    }


    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> resList = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack2(resList, new ArrayList<>(), candidates, target, 0);
        return resList;
    }

    private static void backtrack2(List<List<Integer>> resList, ArrayList<Object> tmpList,
        int[] candidates, int remain, int start) {
        if (remain < 0) {
            return;
        }
        if (remain == 0) {
            resList.add(new ArrayList(tmpList));
        } else {
            for (int i = start; i < candidates.length; ++i) {
                if (i > start && candidates[i] == candidates[i - 1]) {
                    continue;
                }
                tmpList.add(candidates[i]);
                backtrack2(resList, tmpList, candidates, remain - candidates[i], i + 1);
                tmpList.remove(tmpList.size() - 1);
            }
        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resList = new ArrayList<>();
        Arrays.sort(nums);
        backtrack3(resList, new ArrayList<>(), nums);
        return resList;
    }

    private static void backtrack3(List<List<Integer>> resList, ArrayList<Object> tmpList,
        int[] nums) {
        if (tmpList.size() == nums.length) {
            resList.add(new ArrayList(tmpList));
        } else {
            for (int i = 0; i < nums.length; ++i) {
                if (tmpList.contains(nums[i])) {
                    continue;
                }
                tmpList.add(nums[i]);
                backtrack3(resList, tmpList, nums);
                tmpList.remove(tmpList.size() - 1);
            }
        }
    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> resList = new ArrayList<>();
        Arrays.sort(nums);
        backtrack4(resList, new ArrayList<>(), nums, new boolean[nums.length]);
        return resList;
    }

    private static void backtrack4(List<List<Integer>> resList, ArrayList<Object> tmpList,
        int[] nums,
        boolean[] used) {
        if (tmpList.size() == nums.length) {
            resList.add(new ArrayList(tmpList));
        }
        for (int i = 0; i < nums.length; ++i) {
            if (used[i] || i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }
            used[i] = true;
            tmpList.add(nums[i]);
            backtrack4(resList, tmpList, nums, used);
            used[i] = false;
            tmpList.remove(tmpList.size() - 1);
        }
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> resList = new ArrayList<>();
        Arrays.sort(nums);
        backtrack5(resList, new ArrayList<>(), nums, 0);
        return resList;
    }

    private static void backtrack5(List<List<Integer>> resList, ArrayList<Object> tmpList, int[] nums,
        int start) {
        resList.add(new ArrayList(tmpList));
        for(int i = start; i < nums.length; ++i){
            tmpList.add(nums[i]);
            backtrack5(resList,tmpList,nums,i + 1);
            tmpList.remove(tmpList.size() - 1);
        }
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> resList = new ArrayList<>();
        Arrays.sort(nums);
        backtrack6(resList,new ArrayList<>(),nums,0);
        return resList;
    }

    private static void backtrack6(List<List<Integer>> resList, ArrayList<Object> tmpList,
        int[] nums, int start) {
        resList.add(new ArrayList(tmpList));
        for(int i = start; i < nums.length; ++i){
            if(i > start && nums[i] == nums[i-1]) continue;
            tmpList.add(nums[i]);
            backtrack6(resList,tmpList,nums,i+1);
            tmpList.remove(tmpList.size() - 1);
        }
    }

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> resList = new ArrayList<>();
        int[] nums = new int[n];
        for(int i = 0; i < n; ++i) nums[i] = i + 1;
        backtrack7(resList,new ArrayList<>(),nums,0,k);
        return resList;

    }

    private static void backtrack7(List<List<Integer>> resList, ArrayList<Object> tmpList, int[] nums,
        int start,int k) {
        if(tmpList.size() == k) resList.add(new ArrayList(tmpList));
        else{
            for(int i = start; i < nums.length; ++i){
                tmpList.add(nums[i]);
                backtrack7(resList,tmpList,nums,i+1,k);
                tmpList.remove(tmpList.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2};
        int target = 8;
        int n = 4,k  = 2;
//        System.out.println(combinationSum2(nums,target));
//        System.out.println(subsets(nums));
        System.out.println(combine(n,k));
    }
}
