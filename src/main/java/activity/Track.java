package activity;

import java.util.ArrayList;
import java.util.List;

public class Track {
    private List<TrackPoint> trackPoints = new ArrayList<>();

    public List<TrackPoint> getTrackPoints() {
        return new ArrayList<>(trackPoints);
    }

    public void addTrackPoint(TrackPoint point){
        trackPoints.add(point);
    }


}
