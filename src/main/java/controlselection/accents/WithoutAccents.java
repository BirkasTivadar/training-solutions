package controlselection.accents;

import java.util.Arrays;
import java.util.List;

public class WithoutAccents {

    private final List<Character> ekezetes = Arrays.asList('á', 'é', 'í', 'ó', 'ö', 'ő', 'ú', 'ü', 'ű', 'Á', 'É', 'Í', 'Ó', 'Ö', 'Ő', 'Ú', 'Ü', 'Ű');

    public char convertToCharWithoutAccents(char letter) {

        if (ekezetes.contains(letter)) {
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