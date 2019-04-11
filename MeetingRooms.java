package lintcode;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Interval {
             int start, end;
             Interval(int start, int end) {
                 this.start = start;
                 this.end = end;
             }
}

public class MeetingRooms {
    public boolean canAttendMeetings(List<Interval> intervals) {
        // Write your code here

        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });
        int end = intervals.get(0).end;

        for (int i=0; i< intervals.size(); i++){
            if(end > intervals.get(i).start){
                return false;
            }

            end = Math.max(end, intervals.get(i).end);
        }

        return true;
    }
}
