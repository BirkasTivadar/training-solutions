package enumtype.unit;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class UnitConverter {

    public static final int DEFAULT_SCALE = 4;

    public BigDecimal convert(java.math.BigDecimal length, LengthUnit source, LengthUnit target){
        BigDecimal lengthMillimeter = length.multiply(new BigDecimal(source.getMillimeter()));
        return lengthMillimeter.divide(new BigDecimal(target.getMillimeter()), DEFAULT_SCALE, RoundingMode.HALF_UP);
    }

    public List<LengthUnit> siUnits(){
        List<LengthUnit> siUnits = new ArrayList<>();
        for(LengthUnit unit : LengthUnit.values()){
            if(unit.isSi() == true){
                siUnits.add(unit);
            }
        }
        return siUnits;
    }
}
