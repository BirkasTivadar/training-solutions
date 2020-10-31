package statements;

public class StateMain {

    public static void main(String[] args) {

        int x = 5 + 6;
        int y = 11 - x;
        int z = 8;

        boolean b = (x > y);

        boolean c = b || (z > 5);

        z++;
    }
}
