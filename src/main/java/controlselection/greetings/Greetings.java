package controlselection.greetings;

public class Greetings {

    public static final int SIXTY = 60;

    public String greet(int hours, int minutes) {
        int sumMinutes = minutes + hours * SIXTY;
        if (sumMinutes < 300 || sumMinutes >= 1200) {
            return "Jó éjt!";
        } else if (sumMinutes >= 300 && sumMinutes < 540) {
            return "Jó reggelt!";
        } else if (sumMinutes >= 540 && sumMinutes < 1110) {
            return "Jó napot!";
        } else {
            return "Jó estét!";
        }
    }
}
