package controlselection.greetings;

public class Greetings {

    public static final int SIXTY = 60;

    public void greet(int hours, int minutes){
        int sumMinutes = minutes + hours * SIXTY;
        if(sumMinutes < 300 || sumMinutes >= 1200){
            System.out.println("Jó éjt!");
        } else if(sumMinutes >= 300 && sumMinutes < 540) {
            System.out.println("Jó reggelt!");
        } else if(sumMinutes >= 540 && sumMinutes < 1110){
            System.out.println("Jó napot!");
        } else {
            System.out.println("Jó estét!");
        }
    }
}
