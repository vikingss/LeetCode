package round3;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @Author: xunruibo
 * @Description:
 * @Date: Created in 11:15 2018/10/30
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
        for(int i = 1; i < intervals.size();  ++i){
            Interval next = intervals.get(i);
            if(next.start <=  end) end = Math.max(end,next.end);
            else{
                resList.add(new Interval(start,end));
                start = next.start;
                end = next.end;
            }
        }
        resList.add(new Interval(start,end));
        return resList;
    }
}
