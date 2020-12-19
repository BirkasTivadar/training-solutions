package enumtype.unit;

import java.util.Arrays;

public class UnitConverterMain {
    public static void main(String[] args) {
        UnitConverter unitConverter = new UnitConverter();

        double num = unitConverter.convert(324.5678, LengthUnit.FOOT, LengthUnit.INCH);
        System.out.println(num);

        System.out.println(Arrays.toString(LengthUnit.values()));
        System.out.println(LengthUnit.siUnits().toString());

    }
}
