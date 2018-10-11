package round2;

import com.viki.leetcode.firstLevel113.Interval;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 16:53 2018/10/11
 * @Modified By:
 */
public class No56 {
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
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> resList = new ArrayList<>();
        if(intervals == null || intervals.size() == 0) return resList;
        intervals.sort(Comparator.comparingInt(o -> o.start));
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        for (int i = 1; i < intervals.size(); ++i){
            if(intervals.get(i).start <= end ) {
                end = Math.max(end,intervals.get(i).end);
            }else{
                resList.add(new Interval(start,end));
                start = intervals.get(i).start;
                end =  intervals.get(i).end;
            }
        }
        resList.add(new Interval(start,end));
        return resList;
    }

}
