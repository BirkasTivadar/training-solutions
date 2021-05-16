package schoolrecords;

import java.util.*;

public class SchoolRecordsController {

    private ClassRecords classRecords = new ClassRecords("4B", new Random());

    private Set<Subject> subjects = new HashSet<>();

    private List<Tutor> tutors = new ArrayList<>();

    private Scanner scanner = new Scanner(System.in);

    Subject foldrajz = new Subject("földrajz");
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
        subjects.addAll(csuszko.getTaughtSubjects());
        subjects.addAll(pifel.getTaughtSubjects());
    }

    public void printMenu() {
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
        System.out.println("11. Kilépés\n");
    }

    public void runMenu(int menuNumber) {
        switch (menuNumber) {
            case 1 -> menu1();
            case 2 -> menu2();
            case 3 -> menu3();
            case 4 -> menu4();
            case 5 -> menu5();
            case 6 -> menu6();
            case 7 -> menu7();
            case 8 -> menu8();
            case 9 -> menu9();
            case 10 -> menu10();

        }
    }


    private void menu1() {
        System.out.println(classRecords.listStudentNames());
    }


    private void menu2() {

        Student student = new Student(loadStudentName());

        System.out.println(classRecords.findStudentByName(student.getName()));
    }


    private void menu3() {

        Student student = new Student(loadStudentName());

        classRecords.addStudent(student);
    }


    private void menu4() {

        Student student = new Student(loadStudentName());

        classRecords.removeStudent(student);
    }


    private void menu5() {

        Student repStudent = classRecords.repetition();

        System.out.println("Felel: " + repStudent.getName());

        Mark mark = new Mark(repMarkType(), repSubject(), repTutor());
        repStudent.grading(mark);
    }


    private MarkType repMarkType() {

        int repMark = loadMark();

        for (MarkType markType : MarkType.values()) {

            if (repMark == markType.getValue()) {
                return markType;
            }
        }

        throw new IllegalArgumentException("Az érdemjegy 1 és 5 között lehet csak!");
    }


    private Tutor repTutor() {

        System.out.println("Kérem a tanár nevét.");
        String tutorName = scanner.nextLine();

        for (Tutor tutor : tutors) {

            if (tutor.getName().equals(tutorName)) {
                return tutor;
            }
        }

        throw new IllegalArgumentException("Ilyen nevű tanár nincs");
    }

    private Subject repSubject() {

        Subject repetitionSubject = new Subject(loadSubjectName());

        for (Subject subject : subjects) {
            if (subject.getSubjectName().equals(repetitionSubject.getSubjectName())) {
                return subject;
            }
        }

        throw new IllegalArgumentException("Ilyen tantárgy nincs!");
    }


    private void menu6() {
        System.out.println(String.format("Az osztályátlag: %.2f", classRecords.calculateClassAverage()));
    }


    private void menu7() {

        Subject subject = new Subject(loadSubjectName());

        double subjectAverage = classRecords.calculateClassAverageBySubject(subject);

        System.out.println(String.format("A %s tantárgyi átlag: %.2f", subject.getSubjectName(), subjectAverage));
    }


    private void menu8() {
        classRecords.getStudents().forEach(e -> System.out.println(e.getName() + ": " + e.calculateAverage()));
    }

    private void menu9() {

        String studentName = loadStudentName();

        System.out.println(String.format("%s diák átlaga: %.2f", studentName, classRecords.findStudentByName(studentName).calculateAverage()));
    }


    private void menu10() {

        String studentName = loadStudentName();

        String subjectName = loadSubjectName();

        Subject subject = new Subject(subjectName);

        System.out.println(String.format("A %s diák, %s tantárgyának átlaga %.2f", studentName, subjectName, classRecords.findStudentByName(studentName).calculateSubjectAverage(subject)));
    }


    private String loadStudentName() {

        System.out.println("Kérem a diák nevét:");
        String name = scanner.nextLine();

        return name;
    }


    private String loadSubjectName() {

        System.out.println("Kérem a tantárgy nevét:");
        String name = scanner.nextLine();

        return name;
    }


    private int loadMark() {

        System.out.println("Kérem a jegyet:");

        int mark = scanner.nextInt();
        scanner.nextLine();

        return mark;
    }


    public static void main(String[] args) {

        SchoolRecordsController schoolRecordsController = new SchoolRecordsController();

        schoolRecordsController.initScool();

        int menuPont = 0;

        Scanner scanner = new Scanner(System.in);

        while (menuPont != 11) {

            schoolRecordsController.printMenu();

            System.out.println("Melyik pontot választja?");
            menuPont = scanner.nextInt();
            scanner.nextLine();

            schoolRecordsController.runMenu(menuPont);
        }
    }
}
