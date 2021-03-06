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
        colors.remove(colors.size() - 1);
    }

    public List<String> getColors() {
        return new ArrayList<>(colors);
    }

    public static void main(String[] args) {
        Capsules capsules = new Capsules();

        capsules.addFirst("red");
        System.out.println(capsules.getColors() + "\n");

        capsules.addLast("blue");
        System.out.println(capsules.getColors() + "\n");

        capsules.addFirst("green");
        System.out.println(capsules.getColors() + "\n");

        capsules.addLast("yellow");
        System.out.println(capsules.getColors() + "\n");

        capsules.removeFirst();
        System.out.println(capsules.getColors() + "\n");

        capsules.removeLast();
        System.out.println(capsules.getColors() + "\n");

        List<String> colors = capsules.getColors();

        System.out.println(colors + "\n");
        colors.clear();
        System.out.println(colors);

        colors = capsules.getColors();
        System.out.println(colors);
    }
}
