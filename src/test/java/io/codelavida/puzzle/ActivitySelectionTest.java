package io.codelavida.puzzle;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static io.codelavida.puzzle.ActivitySelection.*;
import static org.junit.Assert.*;

public class ActivitySelectionTest {

    @Test
    public void testActivitySelection() {
        List<Activity> activities = new LinkedList<>();
        activities.add(new Activity(1, 20, 30));
        activities.add(new Activity(2, 10, 20));
        activities.add(new Activity(3, 12, 25));
        List<Activity> result = activitySelection(activities);
        assertEquals(2, result.size());
        assertEquals(2, result.get(0).getActivityId());
        assertEquals(1, result.get(1).getActivityId());
    }

}