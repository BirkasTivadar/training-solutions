package activity;

import introconstructors.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class Activities {

    private List<Activity> activities;

    public Activities(List<Activity> activities) {
        this.activities = activities;
    }

    public List<Activity> getActivities() {
        return new ArrayList<>(activities);
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public int numberOfTrackActivities() {
        int sum = 0;
        for (Activity activity : activities) {
            if (activity.getType().isHasTrack()) {
                sum++;
            }
        }
        return sum;
    }

    public int numberOfWithoutTrackActivities() {
        int sum = 0;
        for (Activity activity : activities) {
            if (!activity.getType().isHasTrack()) {
                sum++;
            }
        }
        return sum;
    }

    public List<Report> distancesByTypes() {
        List<Report> result = new ArrayList<>();
        double[] distances = new double[ActivityType.values().length];
        for (Activity activity : activities) {
            if (!activity.getType().isHasTrack()) {
                continue;
            }
            distances[activity.getType().ordinal()] += activity.getDistance();
        }
        for (ActivityType activityType : ActivityType.values()) {
            Report report = new Report(activityType, distances[activityType.ordinal()]);
            result.add(report);
        }
        return result;
    }
}
