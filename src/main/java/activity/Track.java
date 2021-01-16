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
        double sumElevation = 0;
        for (int i = 1; i < trackPoints.size(); i++) {
            sumElevation += trackPoints.get(i).higherWith(trackPoints.get(i - 1));
        }
        return sumElevation;
    }

    public double getFullDecrease() {
        if (trackPoints == null || trackPoints.size() < 2) {
            return 0;
        }
        double sumDecrease = 0;
        for (int i = 1; i < trackPoints.size(); i++) {
            sumDecrease += trackPoints.get(i).lowerWith(trackPoints.get(i - 1));
        }
        return sumDecrease;
    }

    public double getDistance() {
        if (trackPoints == null || trackPoints.size() < 2) {
            return 0;
        }
        double sumDistance = 0;
        for (int i = 1; i < trackPoints.size(); i++) {
            sumDistance += trackPoints.get(i).getDistanceFrom(trackPoints.get(i - 1));
        }
        return sumDistance;
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

    public double getRectangleArea() {
        double x = findMaximumCoordinate().getLatitude() - findMinimumCoordinate().getLatitude();
        double y = findMaximumCoordinate().getLongitude() - findMinimumCoordinate().getLongitude();

        return x * y;
    }
}

