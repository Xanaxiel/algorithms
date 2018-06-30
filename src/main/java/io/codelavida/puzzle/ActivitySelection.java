package io.codelavida.puzzle;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ActivitySelection implements Problem {
    @Override
    public void describe() {
        System.out.println(
                "Given a set of activities and their start and finish times,\n" +
                        "select the maximum number of non-overlapping activities.\n"
        );
    }

    @Override
    public void solve(Scanner scanner) {

    }

    static class Activity implements Comparable<Activity> {
        private int activityId;
        private int start;
        private int finish;

        Activity(int activityId, int start, int finish) {
            this.activityId = activityId;
            this.start = start;
            this.finish = finish;
        }

        @Override
        public int compareTo(Activity o) {
            return this.finish - o.finish;
        }

        public int getActivityId() {
            return activityId;
        }
    }

    /**
     * @param activities list of activities
     */
    public static List<Activity> activitySelection(List<Activity> activities) {
        Collections.sort(activities);
        List<Activity> result = new LinkedList<>();
        result.add(activities.get(0));
        for (int i = 1, k = 2; i < activities.size(); i++) {
            if (activities.get(i).finish >= activities.get(k).finish) {
                result.add(activities.get(i));
                k = i;
            }
        }
        return result;
    }

}
