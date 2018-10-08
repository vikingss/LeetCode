package com.viki.leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a collection of intervals, merge all overlapping intervals.
 *
 * Example 1:
 *
 * Input: [[1,3],[2,6],[8,10],[15,18]] Output: [[1,6],[8,10],[15,18]]
 *
 * Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6]. Example 2:
 *
 * Input: [[1,4],[4,5]] Output: [[1,5]] Explanation: Intervals [1,4] and [4,5] are considerred
 * overlapping.
 */
public class firstLevel113 {

    public static class Interval {

        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }

    public static List<Interval> merge(List<Interval> intervals) {
        if(intervals == null || intervals.size() <= 1){
            return intervals;
        }
        intervals = intervals
            .stream()
            .sorted(Comparator.comparingInt(o -> o.start))
            .collect(Collectors.toList());
        List<Interval> resList = new ArrayList<>();
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        for(int i = 1; i < intervals.size(); ++i){
            if(end >= intervals.get(i).start){
                end = end > intervals.get(i).end ? end : intervals.get(i).end;
            }else{
                Interval interval = new Interval(start,end);
                resList.add(interval);
                start = intervals.get(i).start;
                end = intervals.get(i).end;
            }
        }
        resList.add(new Interval(start,end));
        return resList;
    }

    public static void main(String[] args) {
        Interval i1 = new Interval(1,3);
        Interval i2 = new Interval(2,6);
        Interval i3 = new Interval(8,10);
        Interval i4 = new Interval(15,18);
        List<Interval> list = new ArrayList<>();
        list.add(i1);
        list.add(i2);
        list.add(i3);
        list.add(i4);
        merge(list);

    }
}
