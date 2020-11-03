package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Capsules {

    private List<String> colors = new ArrayList<>();

    public void addLast(String last) {
        colors.add(last);
    }

    public void addFirst(String first) {
        colors.add(0, first);
    }

    public void removeFirst() {
        colors.remove(0);
    }

    public void removeLast() {
        colors.remove(colors.size()-1);
    }

    public List<String> getColors() {
        return colors;
    }

    public static void main(String[] args) {
        Capsules capsules = new Capsules();

        capsules.addFirst("red");
        System.out.println(capsules.getColors());
        capsules.addLast("blue");
        System.out.println(capsules.getColors());
        capsules.addFirst("green");
        System.out.println(capsules.getColors());
        capsules.addLast("yellow");
        System.out.println(capsules.getColors());

        capsules.removeFirst();
        System.out.println(capsules.getColors());
        capsules.removeLast();
        System.out.println(capsules.getColors());
        System.out.println();

        List<String> colors = new ArrayList<>();

        colors = capsules.getColors();
        System.out.println(colors);
        colors.clear();

        colors = capsules.getColors();
        System.out.println(colors);
        System.out.println(capsules.getColors());

    }
}
