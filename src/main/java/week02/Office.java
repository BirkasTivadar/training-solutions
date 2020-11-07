package week02;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Office {
    private List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);
    }

    public void printNames() {
        for (MeetingRoom meetingRoom : meetingRooms) {
            System.out.println(meetingRoom.getName());
        }
    }

    public void printNamesReverse(){

        for(int i = meetingRooms.size() - 1; i > -1; i--){
            MeetingRoom meetingRoom = meetingRooms.get(i);
            System.out.println(meetingRoom.getName());
        }
    }

}
