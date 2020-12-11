package week07d05;

public class PaperMain {

    public static void main(String[] args) {
        Paper paper = new Paper();
        Writeable writeable = paper;
        Erasable erasable = paper;

        writeable.write("alma");
        paper.write("körte");
        System.out.println(paper.getContent());
        erasable.erase();
        System.out.println(paper.getContent());
    }



}
