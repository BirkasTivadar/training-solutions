package typeconversion.whichtype;

import java.util.ArrayList;
import java.util.List;

public class WhichType {

    public List<Type> whichType(String s){
        List<Type> typeList = new ArrayList<>();
        long num = Long.parseLong(s);
        for(Type type : Type.values()){
            if(num >= type.getMinValue() && num <= type.getMaxValue()){
                typeList.add(type);
            }
        }
        return typeList;
    }
}
