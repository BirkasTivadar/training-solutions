package week02;

import java.util.ArrayList;
import java.util.List;

public class Office {
    private List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom){
        meetingRooms.add(meetingRoom);
    }

    public void printNames(){
        for(MeetingRoom meetingRoom : meetingRooms){
            System.out.println(meetingRoom.getName());
        }
    }
}
