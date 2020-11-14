package enumtype.unit;

import java.math.BigDecimal;
import java.util.Arrays;

public class UnitConverterMain {

    public static void main(String[] args) {
        UnitConverter unitConverter = new UnitConverter();

        System.out.println(unitConverter.convert(new BigDecimal(9), LengthUnit.METER, LengthUnit.YARD));
        System.out.println(unitConverter.convert(new BigDecimal(9), LengthUnit.METER, LengthUnit.CENTIMETER));
        System.out.println(unitConverter.convert(new BigDecimal(9), LengthUnit.YARD, LengthUnit.INCH));

        System.out.println(Arrays.toString(LengthUnit.values()));
        System.out.println(unitConverter.siUnits());

    }
}
