package activity;

import java.util.List;

public class Activities {

    private List<Activity> activities;

    public Activities(List<Activity> activities) {
        this.activities = activities;
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public int numberOfTrackActivities() {
        int sum = 0;
        for (Activity activity : activities) {
            if (activity instanceof ActivityWithTrack) {
                sum++;
            }
        }
        return sum;
    }

    public int numberOfWithoutTrackActivities() {
        int sum = 0;
        for (Activity activity : activities) {
            if (activity instanceof ActivityWithoutTrack) {
                sum++;
            }
        }
        return sum;
    }

}
