package interfacedefaultmethods.print;

public class TestPrintable implements Printable {
    private int lenght;

    @Override
    public int getLength() {
        return lenght;
    }

    @Override
    public String getPage(int pageNumber) {
        return "" + pageNumber;
    }

    public static void main(String[] args) {
        TestPrintable testPrintable = new TestPrintable();
        System.out.println(testPrintable.getLength());
        System.out.println(testPrintable.getColor(3));
        System.out.println(testPrintable.getPage(23));
    }
}
