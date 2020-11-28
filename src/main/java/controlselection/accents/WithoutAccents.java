package controlselection.accents;

public class WithoutAccents {
    private final char[] ekezetes = {'á', 'é', 'í', 'ó', 'ö', 'ő', 'ú', 'ü', 'ű', 'Á', 'É', 'Í', 'Ó', 'Ö', 'Ő', 'Ú', 'Ü', 'Ű'};


    public boolean withAccent(char letter) {
        for (char character : ekezetes) {
            if (letter == character) {
                return true;
            }
        }
        return false;
    }

    public char convertToCharWithoutAccents(char letter) {
        Character result = letter;
        if (withAccent(letter)) {
            switch (letter) {
                case 'á':
                    result = 'a';
                    break;
                case 'é':
                    result = 'e';
                    break;
                case 'í':
                    result = 'i';
                    break;
                case 'ó':
                case 'ö':
                case 'ő':
                    result = 'o';
                    break;
                case 'ú':
                case 'ü':
                case 'ű':
                    result = 'u';
                    break;
                case 'Á':
                    result = 'A';
                    break;
                case 'É':
                    result = 'E';
                    break;
                case 'Í':
                    result = 'I';
                    break;
                case 'Ó':
                case 'Ö':
                case 'Ő':
                    result = 'O';
                    break;
                case 'Ú':
                case 'Ü':
                case 'Ű':
                    result = 'U';
                    break;
            }
        }
        return result;
    }
}