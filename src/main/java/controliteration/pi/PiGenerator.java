package controliteration.pi;

public class PiGenerator {

    private final String piPoet = "Nem a régi s durva közelítés,\n" +
            "    Mi szótól szóig így kijön\n" +
            "    Betűiket számlálva.\n" +
            "    Ludolph eredménye már,\n" +
            "    Ha itt végezzük húsz jegyen.\n" +
            "    De rendre kijő még tíz pontosan,\n" +
            "    Azt is bízvást ígérhetem.";

    public String getPi() {
        String piStr = "";
        int counter = 0;
        for (int i = 0; i < piPoet.length(); i++) {
            if (counter != 0 && !Character.isAlphabetic(piPoet.charAt(i))) {
                piStr += counter;
                counter = 0;
                if (piStr.length() == 1) {
                    piStr += ".";
                }
            }
            if (Character.isAlphabetic(piPoet.charAt(i))) {
                counter++;
            }
        }
        return piStr;
    }
}
