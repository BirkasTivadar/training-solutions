package interfacedefaultmethods.print;

public class Printer {

    public String print(Printable printable) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < printable.getLength(); i++) {
            if (!Printable.BLACK.equals(printable.getColor(i))) {
                stringBuilder.append("[").append(printable.getColor(i)).append("]");
            }
            stringBuilder.append(printable.getPage(i)).append("\n");
        }
        return stringBuilder.toString();
    }
}
