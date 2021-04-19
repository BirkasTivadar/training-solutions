package controlselection.accents;

import java.util.Arrays;

public class WithoutAccents {
    private final Character[] ekezetes = {'á', 'é', 'í', 'ó', 'ö', 'ő', 'ú', 'ü', 'ű', 'Á', 'É', 'Í', 'Ó', 'Ö', 'Ő', 'Ú', 'Ü', 'Ű'};


    public boolean withAccent(char letter) {
        return Arrays.stream(ekezetes).anyMatch(e -> e == letter);
//        for (char character : ekezetes) {
//            if (letter == character) {
//                return true;
//            }
//        }
//        return false;
    }

    public char convertToCharWithoutAccents(char letter) {

        if (withAccent(letter)) {
            switch (letter) {
                case 'á':
                    return 'a';

                case 'é':
                    return 'e';

                case 'í':
                    return 'i';

                case 'ó':
                case 'ö':
                case 'ő':
                    return 'o';

                case 'ú':
                case 'ü':
                case 'ű':
                    return 'u';

                case 'Á':
                    return 'A';

                case 'É':
                    return 'E';

                case 'Í':
                    return 'I';

                case 'Ó':
                case 'Ö':
                case 'Ő':
                    return 'O';

                case 'Ú':
                case 'Ü':
                case 'Ű':
                    return 'U';
            }
        }
        return letter;
    }
}