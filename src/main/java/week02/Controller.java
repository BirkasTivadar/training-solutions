package week02;

public class Controller {

    public static void main(String[] args) {
        MeetingRoom meetingRoom = new MeetingRoom("Tárgyaló", 4,5);

        System.out.println(meetingRoom.getArea());
    }
}
