package finalmodifier;

import java.util.Arrays;
import java.util.List;

public class Week {

    public static final List<String> DAYS_OF_THE_WEEK = Arrays.asList("Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap");

    public static void main(String[] args) {

        DAYS_OF_THE_WEEK.set(1, "Szerda");

        System.out.println(DAYS_OF_THE_WEEK);

        List<String> dias = Arrays.asList("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo");

        // DAYS_OF_THE_WEEK = dias;
    }
}
