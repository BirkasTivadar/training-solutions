package covid;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CovidFileManager {

    public void writeCitizensToFile(List<Citizen> citizens) {
        try (BufferedWriter writer = Files.newBufferedWriter(Path.of("citizens_for_vaccination.csv"))) {
            writer.write("Időpont;Név;Irányítószám;Életkor;E-mail cím; TAJ szám\n");
            for (int i = 0; i < citizens.size(); i++) {
                Citizen citizen = citizens.get(i);
                String time = i % 2 == 0 ? 8 + i / 2 + ":00" : 8 + i / 2 + ":30";
                writer.write(time + ";" + citizen.getName() + ";" + citizen.getZip() + ";" + citizen.getAge() + ";" + citizen.getEmail() + ";" + citizen.getTaj()+"\n");
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

}
