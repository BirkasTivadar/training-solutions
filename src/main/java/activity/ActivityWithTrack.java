package activity;

public class ActivityWithTrack implements Activity {
    private ActivityType activityType;
    private Track track;

    public ActivityWithTrack(Track track, ActivityType activityType) {
        if ((activityType.isHasTrack() == false)){
            throw new IllegalArgumentException("This activity: "+ activityType + " has not track.");
        }
        this.track = track;
        this.activityType = activityType;
    }

    @Override
    public double getDistance() {
        return track.getDistance();
    }

    @Override
    public ActivityType getType() {
        return activityType;
    }
}
