package array;

public class ArrayMain {

    public static void main(String[] args) {

        String[] hetNapjai = {"hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap"};

        System.out.println(hetNapjai[1]);
        System.out.println(hetNapjai.length);


        int[] kettoHatvanyai = new int[5];

        for (int i = 0; i < kettoHatvanyai.length; i++) {
            kettoHatvanyai[i] = (int)Math.pow(2.0, (double)i);
            System.out.println(kettoHatvanyai[i]);
        }

        boolean[] falsesTrues = {false, true, false, true, false, true};

        for(boolean bool: falsesTrues) {
            System.out.println(bool);
        }



    }
}

