package enumtype.unit;

public enum LengthUnit {
    METER(1000, true),
    CENTIMETER(10, true),
    MILLIMETER(1, true),
    YARD(9144,false),
    FOOT(3048, false),
    INCH(254, false);

    private final int millimeter;

    private final boolean si;

    LengthUnit(int millimeter, boolean si) {
        this.millimeter = millimeter;
        this.si = si;
    }

    public int getMillimeter() {
        return millimeter;
    }

    public boolean isSi() {
        return si;
    }
}
