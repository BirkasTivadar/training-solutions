package typeconversion.whichtype;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WhichType {

    public List<Type> whichType(String s) {
        long num = Long.parseLong(s);
        return Arrays.stream(Type.values()).filter(e -> e.getMinValue() <= num && e.getMaxValue() >= num).collect(Collectors.toList());
//        List<Type> typeList = new ArrayList<>();
//        for (Type type : Type.values()) {
//            if (num >= type.getMinValue() && num <= type.getMaxValue()) {
//                typeList.add(type);
//            }
//        }
//        return typeList;
    }
}

