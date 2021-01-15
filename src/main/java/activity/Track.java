package activity;

import java.util.ArrayList;
import java.util.List;

public class Track {
    private List<TrackPoint> trackPoints = new ArrayList<>();

    public List<TrackPoint> getTrackPoints() {
        return new ArrayList<>(trackPoints);
    }

    public void addTrackPoint(TrackPoint point) {
        trackPoints.add(point);
    }

    public double getFullElevation() {
        if (trackPoints == null || trackPoints.size() < 2) {
            return 0;
        }
        double sum = 0;
        for (int i = 1; i < trackPoints.size(); i++) {
            double difference = trackPoints.get(i).getElevation() - trackPoints.get(i - 1).getElevation();
            if (difference > 0) {
                sum += difference;
            }
        }
        return sum;
    }

    public double getFullDecrease() {
        if (trackPoints == null || trackPoints.size() < 2) {
            return 0;
        }
        double sum = 0;
        for (int i = 1; i < trackPoints.size(); i++) {
            double difference = trackPoints.get(i).getElevation() - trackPoints.get(i - 1).getElevation();
            if (difference < 0) {
                sum += -difference;
            }
        }
        return sum;
    }

    public double getDistance() {
        if (trackPoints == null || trackPoints.size() < 2) {
            return 0;
        }
        double sum = 0;
        for (int i = 1; i < trackPoints.size(); i++) {
            double difference = trackPoints.get(i).getDistanceFrom(trackPoints.get(i - 1));
            sum += difference;
        }
        return sum;
    }

    public static void main(String[] args) {
        Track track = new Track();
        track.addTrackPoint(new TrackPoint(new Coordinate(12.5, 34.89), 123));
        track.addTrackPoint(new TrackPoint(new Coordinate(-12.5, 45.7), 124));
        track.addTrackPoint(new TrackPoint(new Coordinate(13.7, -6.0), 0));
        track.addTrackPoint(new TrackPoint(new Coordinate(3.67, -42.789), 200));
        System.out.println(track.getDistance());
    }

    public Coordinate findMinimumCoordinate() {
        double minLatitude = trackPoints.get(0).getCoordinate().getLatitude();
        double minLongitude = trackPoints.get(0).getCoordinate().getLongitude();
        for (TrackPoint point : trackPoints) {
            if (point.getCoordinate().getLatitude() < minLatitude) {
                minLatitude = point.getCoordinate().getLatitude();
            }
            if (point.getCoordinate().getLongitude() < minLongitude) {
                minLongitude = point.getCoordinate().getLongitude();
            }
        }
        return new Coordinate(minLatitude, minLongitude);
    }

    public Coordinate findMaximumCoordinate() {
        double maxLatitude = trackPoints.get(0).getCoordinate().getLatitude();
        double maxLongitude = trackPoints.get(0).getCoordinate().getLongitude();
        for (TrackPoint point : trackPoints) {
            if (point.getCoordinate().getLatitude() > maxLatitude) {
                maxLatitude = point.getCoordinate().getLatitude();
            }
            if (point.getCoordinate().getLongitude() > maxLongitude) {
                maxLongitude = point.getCoordinate().getLongitude();
            }
        }
        return new Coordinate(maxLatitude, maxLongitude);
    }

}

