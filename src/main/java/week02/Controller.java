package week02;

public class Controller {

    public static void main(String[] args) {
        MeetingRoom targyalo = new MeetingRoom("Tárgyaló", 10, 7);
        MeetingRoom kistargyalo = new MeetingRoom("KisTárgyaló", 4, 5);

        System.out.println(targyalo.getArea());
        System.out.println(kistargyalo.getArea());
        System.out.println();

        Office meetingRooms = new Office();

        meetingRooms.addMeetingRoom(targyalo);
        meetingRooms.addMeetingRoom(kistargyalo);

        meetingRooms.printNames();
    }
}
