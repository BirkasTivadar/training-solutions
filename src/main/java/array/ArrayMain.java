package array;

public class ArrayMain {

    public static void main(String[] args) {

        String[] hetNapjai = {"hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap"};

        System.out.println(hetNapjai[1]);

        System.out.println(hetNapjai.length + "\n");

        int[] kettoHatvanyai = new int[5];

        for (int i = 0; i < kettoHatvanyai.length; i++) {
            kettoHatvanyai[i] = (int) Math.pow(2, i);
            System.out.print(kettoHatvanyai[i] + " ");
        }

        System.out.println("\n");

        boolean[] falseAndTrue = new boolean[6];

        for (int i = 1; i < 6; i++) {
            falseAndTrue[i] = (i % 2 == 0 ? false : true);
        }

        for (boolean b : falseAndTrue) {
            System.out.print(b + " ");
        }
    }
}

