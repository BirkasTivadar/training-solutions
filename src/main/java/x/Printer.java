package x;

public class Printer {


    public String print(Printable printable) {
        StringBuilder edition = new StringBuilder();
        for (int i = 0; i < printable.getLength(); i++) {
            if (!printable.getColor(i).equals(printable.BLACK)) {
                edition.append("[").append(printable.getColor(i)).append("]");
            }
            edition.append(printable.getPage(i)).append("\n");
        }
        return edition.toString();
    }
}
