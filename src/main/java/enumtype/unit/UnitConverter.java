package enumtype.unit;

public class UnitConverter {

    public static final double DEFAULT_MULT = 10_000;

    public double convert(double length, LengthUnit source, LengthUnit target) {
        double lengthInMilli = length * source.getMilli();
        double lengthInTarget = lengthInMilli / target.getMilli();
        return (Math.round(lengthInTarget * DEFAULT_MULT)) / DEFAULT_MULT;
    }

//    public List<LengthUnit> siUnits() {
//        List<LengthUnit> units = new ArrayList<>();
//        for (LengthUnit unit : LengthUnit.values()) {
//            if (unit.isSI()) {
//                units.add(unit);
//            }
//        }
//        return units;
//    }

}
