package enumtype.unit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum LengthUnit {

    MILLIMETER(true, 1),

    CENTIMETER(true, 10),

    METER(true, 1000),

    YARD(false, 914),

    FOOT(false, 305),

    INCH(false, 25);

    private boolean isSI;

    private int milli;

    LengthUnit(boolean isSI, int milli) {
        this.isSI = isSI;
        this.milli = milli;
    }

    public boolean isSI() {
        return isSI;
    }

    public int getMilli() {
        return milli;
    }

    public static List<LengthUnit> siUnits() {
        return Arrays.stream(LengthUnit.values()).filter(LengthUnit::isSI).collect(Collectors.toList());
    }
}
