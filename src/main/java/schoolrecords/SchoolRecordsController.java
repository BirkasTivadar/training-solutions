package schoolrecords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SchoolRecordsController {
    private ClassRecords classRecords = new ClassRecords("4B", new Random());
    private List<Subject> subjects = new ArrayList<>();
    private List<Tutor> tutors = new ArrayList<>();

    Subject foldrajz = new Subject("földrajz") ;
    Subject zene = new Subject("zene");
    Subject fizika = new Subject("fizika");
    Subject kemia = new Subject("kémia");
    Subject testneveles = new Subject("testnevelés");
    Subject matematika = new Subject("matematika");
    Subject biologia = new Subject("biológia");

    Tutor csuszko = new Tutor("Csuszkó", Arrays.asList(foldrajz, zene, fizika, kemia));
    Tutor pifel = new Tutor("Pifél", Arrays.asList(biologia, zene, matematika, testneveles, fizika));

    public void initScool() {
        tutors.add(csuszko);
        tutors.add(pifel);
        subjects.add(foldrajz);
        subjects.add(zene);
        subjects.add(fizika);
        subjects.add(kemia);
        subjects.add(testneveles);
        subjects.add(matematika);
        subjects.add(biologia);
    }

    public void printMenu(){
        System.out.println("Választható menüpontok: \n");
        System.out.println("1. Diákok nevének listázása");
        System.out.println("2. Diák név alapján keresése");
        System.out.println("3. Diák létrehozása");
        System.out.println("4. Diák név alapján törlése");
        System.out.println("5. Diák feleltetése");
        System.out.println("6. Osztályátlag kiszámolása");
        System.out.println("7. Tantárgyi átlag kiszámolása");
        System.out.println("8. Diákok átlagának megjelenítése");
        System.out.println("9. Diák átlagának kiírása");
        System.out.println("10. Diák tantárgyhoz tartozó átlagának kiírása");
        System.out.println("11. Kilépés");
    }

    public static void main(String[] args) {
        SchoolRecordsController schoolRecordsController = new SchoolRecordsController();
        schoolRecordsController.initScool();


        schoolRecordsController.classRecords.addStudent(new Student("Lali"));
        System.out.println(schoolRecordsController.classRecords.listStudentNames());
        schoolRecordsController.printMenu();



    }
}
