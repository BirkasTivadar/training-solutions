package stringbasic.stringbasic;

public class StringCreator {

    public String createStringForHeap() {
        return new String("Bibi");
    }

    public String createStringForPool() {
        return "Bibi";
    }

}
