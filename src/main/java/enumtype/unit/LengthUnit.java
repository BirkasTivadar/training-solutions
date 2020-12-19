package enumtype.unit;

import java.util.ArrayList;
import java.util.List;

public enum LengthUnit {
    MILLIMETER(true, 1),
    CENTIMETER(true, 10),
    METER(true, 100),
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
        List<LengthUnit> units = new ArrayList<>();
        for (LengthUnit unit: LengthUnit.values()){
            if(unit.isSI()){
                units.add(unit);
            }
        }
        return units;
    }

}
