package schoolrecords;

import java.util.*;

public class SchoolRecordsController {
    private ClassRecords classRecords = new ClassRecords("4B", new Random());
    private List<Subject> subjects = new ArrayList<>();
    private List<Tutor> tutors = new ArrayList<>();

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
        subjects.add(foldrajz);
        subjects.add(zene);
        subjects.add(fizika);
        subjects.add(kemia);
        subjects.add(testneveles);
        subjects.add(matematika);
        subjects.add(biologia);
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

    public Student findStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem a diák nevét.");
        String name = scanner.nextLine();
        return classRecords.findStudentByName(name);
    }

    public void newStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem a diák nevét.");
        String name = scanner.nextLine();
        Student student = new Student(name);
        classRecords.addStudent(student);
    }

    public void remove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem a diák nevét.");
        String name = scanner.nextLine();
        Student student = new Student(name);
        classRecords.removeStudent(student);
    }


    public MarkType repMarkType() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem az érdemjegyet.");
        int repMark = scanner.nextInt();
        for (MarkType markType : MarkType.values()) {
            if (repMark == markType.getValue()) {
                return markType;
            }
        }
        return null;
    }

    public Tutor repTutor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem a tanár nevét.");
        String tutorName = scanner.nextLine();
        for (Tutor tutor : tutors) {
            if (tutor.getName().equals(tutorName)) {
                return tutor;
            }
        }
        return null;
    }

    public Subject repSubject() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem a tantárgy nevét.");
        String subjectName = scanner.nextLine();
        for (Subject subject : subjects) {
            if (subject.getSubjectName().equals(subjectName)) {
                return subject;
            }
        }
        return null;
    }

    public void repetitionForGrade() {
        Student repStudent = classRecords.repetition();
        System.out.println("Felel: "+ repStudent.getName());
        Mark mark = new Mark(repMarkType(), repSubject(), repTutor());
        repStudent.grading(mark);
    }

    public void runMenu(int menuNumber) {
        switch (menuNumber) {
            case 1:
                System.out.println(classRecords.listStudentNames());
                break;
            case 2:
                System.out.println(findStudent());
                break;
            case 3:
                newStudent();
                break;
            case 4:
                remove();
                break;
            case 5:
                repetitionForGrade();
                break;


        }
    }

    public static void main(String[] args) {
        SchoolRecordsController schoolRecordsController = new SchoolRecordsController();
        schoolRecordsController.initScool();

        schoolRecordsController.classRecords.addStudent(new Student("Lali"));

        System.out.println(schoolRecordsController.classRecords.listStudentNames());

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
