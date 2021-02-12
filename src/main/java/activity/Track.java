package activity;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
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

    private Coordinate loadCoordinate(String line) {
        Double lat = Double.parseDouble(line.substring(line.indexOf("lat=") + 4, line.indexOf("lon") - 2));
        Double lon = Double.parseDouble(line.substring(line.indexOf("lon=") + 4, line.indexOf(">") - 1));
        return new Coordinate(lat, lon);
    }

    private Double loadElevation(String line) {
        return Double.parseDouble(line.substring(line.indexOf(">") + 1, line.indexOf("</")));
    }

    public void loadFromGpx(String fileName) {
        Path path = Path.of("track.gpx");
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains("<trkpt")) {
                    Coordinate coordinate;
                    Double elevation;
                    String temp = line.replace('"', '-');
                    coordinate = loadCoordinate(temp);
                    line = br.readLine();
                    elevation = loadElevation(line);
                    trackPoints.add(new TrackPoint(coordinate, elevation));
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
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

    public static void main(String[] args) {
        Track track = new Track();
        track.loadFromGpx("track.gpx");
        System.out.println(track.getTrackPoints().size());
        System.out.println(track.getTrackPoints());

    }
}

