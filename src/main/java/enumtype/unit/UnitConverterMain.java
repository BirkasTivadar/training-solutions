package enumtype.unit;

import java.util.Arrays;

public class UnitConverterMain {

    public static void main(String[] args) {

        UnitConverter unitConverter = new UnitConverter();

        double num = unitConverter.convert(324.5678, LengthUnit.FOOT, LengthUnit.INCH);
        System.out.println(num);

        double freeKickDistanceByFoot = unitConverter.convert(9, LengthUnit.METER, LengthUnit.YARD);
        System.out.println("\n" + freeKickDistanceByFoot);

        System.out.println("\n" + Arrays.toString(LengthUnit.values()));

        System.out.println("\n" + LengthUnit.siUnits().toString());
    }
}
