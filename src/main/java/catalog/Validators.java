package catalog;

import java.util.List;

public class Validators {

    public boolean isBlank(String str){
        return (str == null || str.isBlank());
    }

    public boolean isEmpty(List<String> list){
        return ( list == null || list.size() < 1);
    }
}
