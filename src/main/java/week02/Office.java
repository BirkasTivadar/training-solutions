package week02;

import java.util.ArrayList;
import java.util.List;

public class Office {

    private List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);
    }

    public void printNames() {
        meetingRooms.stream().forEach(e -> System.out.println(e.getName()));
//        for (MeetingRoom meetingRoom : meetingRooms) {
//            System.out.println(meetingRoom.getName());
//        }
    }

    public void printNamesReverse() {
        for (int i = meetingRooms.size() - 1; i > -1; i--) {
            System.out.println(meetingRooms.get(i).getName());
        }
    }

    public void printEventNames() {
        for (int i = 0; i < meetingRooms.size(); i++) {
            if (i % 2 != 0) {
                System.out.println(meetingRooms.get(i).getName());
            }
        }
    }

    public void printAreas() {
        meetingRooms.stream().forEach(this::printAll);
//        for (MeetingRoom meetingRoom : meetingRooms) {
//            System.out.println(meetingRoom.getName() + ": " + meetingRoom.getWidth() + "m " + meetingRoom.getLength() + "m " + meetingRoom.getArea() + "m2");
//        }
    }

    public void printMeetingRoomsWithName(String name) {
        meetingRooms.stream().filter(e -> e.getName().equals(name)).forEach(this::printDimensions);
//        for (MeetingRoom meetingRoom : meetingRooms) {
//            if (name.equals(meetingRoom.getName())) {
//                System.out.println(meetingRoom.getWidth() + "m " + meetingRoom.getLength() + "m " + meetingRoom.getArea() + "m2");
//            }
//        }
    }

    public void printMeetingRoomsContains(String part) {
        meetingRooms.stream().filter(e -> e.getName().toLowerCase().contains(part.toLowerCase())).forEach(this::printDimensions);
//        String lowerPart = part.toLowerCase();
//        for (MeetingRoom meetingRoom : meetingRooms) {
//            String lowerRoom = meetingRoom.getName().toLowerCase();
//            if (lowerRoom.indexOf(lowerPart) > -1) {
//                System.out.println(meetingRoom.getWidth() + "m " + meetingRoom.getLength() + "m " + meetingRoom.getArea() + "m2");
//            }
//        }
    }

    public void printAreasLargerThan(int area) {
        meetingRooms.stream().filter(e -> e.getArea() > area).forEach(this::printAll);
//        for (MeetingRoom meetingRoom : meetingRooms) {
//            if (meetingRoom.getArea() > area) {
//                System.out.println(meetingRoom.getName() + ": " + meetingRoom.getWidth() + "m " + meetingRoom.getLength() + "m " + meetingRoom.getArea() + "m2");
//            }
//        }
    }

    private void printAll(MeetingRoom meetingRoom) {
        System.out.println(String.format("%s : szélesség: %dm, hosszúság: %dm, terület: %dm2", meetingRoom.getName(), meetingRoom.getWidth(), meetingRoom.getLength(), meetingRoom.getArea()));
    }

    private void printDimensions(MeetingRoom meetingRoom) {
        System.out.println(String.format("szélesség: %dm, hosszúság: %dm, terület: %dm2", meetingRoom.getWidth(), meetingRoom.getLength(), meetingRoom.getArea()));
    }
}
