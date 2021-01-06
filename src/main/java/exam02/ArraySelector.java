package exam02;

public class ArraySelector {

public String selectEvens(int[] numbers){
    String s = "";
    if(numbers.length == 0){
        return s;
    }
    s += "[";
    for(int i=0; i < numbers.length; i++){
        if(i%2 == 0){
            s += numbers[i];
            s += ", ";
        }
    }
    String subString = s.substring(0, s.length()-2);
    return subString + "]";
}

}
